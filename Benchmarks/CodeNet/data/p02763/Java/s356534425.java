import java.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
 
public class Main {
    static int maxn = (int) (5e5 + 5);
    static int maxm = (int) (1e6 + 5);
    static String s;
    static char[] a = new char[maxn];
    
    public static class SegTree {
    	int lf, rt;
    	int[] cnt;
    }
    static SegTree[] st = new SegTree[maxn << 2];
    static void PushUp(int x) {
    	for(int i = 0; i < 26; ++i) {
    		st[x].cnt[i] = st[x << 1].cnt[i] + st[x << 1 | 1].cnt[i];
    	}
    }
    static void Build(int x, int lf, int rt) {
    	st[x] = new SegTree();
    	SegTree now = st[x];
    	now.lf = lf;
    	now.rt = rt;
    	now.cnt = new int[26];
    	if(lf == rt) {
    		for(int i = 0; i < 26; ++i) {
        		now.cnt[i] = 0;
        	}
    		++now.cnt[a[lf] - 'a'];
    		return ;
    	}
    	int mid = (lf + rt) >> 1;
    	Build(x << 1, lf, mid);
    	Build(x << 1 | 1, mid + 1, rt);
    	PushUp(x);
    }
    static void Update(int x, int y, int id) {
    	SegTree now = st[x];
    	if(now.lf == now.rt) {
    		int ori = a[y] - 'a';
    		--now.cnt[ori];
    		++now.cnt[id];
    		return ;
    	}
    	int mid = (now.lf + now.rt) >> 1;
    	if(y <= mid) Update(x << 1, y, id);
    	if(y > mid) Update(x << 1 | 1, y ,id);
    	PushUp(x);
    }
    static int[] Query(int x, int lf, int rt) {
    	SegTree now = st[x];
    	int[] ret = new int[26];
    	if(lf <= now.lf && rt >= now.rt) {
    		for(int i = 0; i < 26; ++i) {
    			ret[i] = now.cnt[i];
    		}
    		return ret;
    	}
    	for(int i = 0; i < 26; ++i) {
			ret[i] = 0;
		}
    	int mid = (now.lf + now.rt) >> 1;
    	int[] res;
    	if(lf <= mid) {
    		res = Query(x << 1, lf, rt);
    		for(int i = 0; i < 26; ++i) {
    			ret[i] += res[i];
    		}
    	}
    	if(rt > mid) {
    		res = Query(x << 1 | 1, lf ,rt);
    		for(int i = 0; i < 26; ++i) {
    			ret[i] += res[i];
    		}
    	}
    	return ret;
    }
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(System.out);
        
        int n = in.nextInt();
        s = in.next();
        for(int i = 0; i < n; ++i) {
        	a[i + 1] = s.charAt(i);
        }
        int m = in.nextInt();
        Build(1, 1, n);
        for(int i = 1; i <= m; ++i) {
        	int t = in.nextInt();
        	
        	if(t == 1) {
        		int y = in.nextInt();
            	String r = in.next();
            	int id = r.charAt(0) - 'a';
        		Update(1, y, id);
        	} else {
        		int l = in.nextInt();
        		int r = in.nextInt();
        		int[] res = Query(1, l, r);
        		int ans = 0;
        		for(int j = 0; j < 26; ++j) {
        			if(res[j] > 0) {
        				++ans;
        			}
        		}
        		out.println(ans);
        	}
        }
        out.flush();
        // Scanner in = new Scanner(System.in);
        // in.close();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public String next() {
            while(tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}