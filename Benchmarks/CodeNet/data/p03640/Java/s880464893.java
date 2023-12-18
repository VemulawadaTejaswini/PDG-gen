
import java.io.*;
import java.util.*;
public class Main {
	static final int N=10005;
	static int a[]=new int[N];
    static int map[][]=new int[1005][1005];
	static int h,w,x,y;
    static int dfs() {
    	int pre=0,cnt=1;
    	for(int i=x;i<h;i++) {
    		if(pre==0) {
    			for(int j=0;j<w;j++) {
    			   map[i][j]=cnt;a[cnt]--;
    			   if(a[cnt]==0) {
    				  cnt++;
    			   }
    			}
    			pre=1-pre;
    		}
    		else {
    			for(int j=w-1;j>=0;j--) {
        			map[i][j]=cnt;a[cnt]--;
        			if(a[cnt]==0) {
        				cnt++;
        			}
        		}
    			pre=1-pre;
    		}
    	}
    	return 0;
    }
	public static void main(String[] args){
		InputReader in = new InputReader(System.in);
	    PrintWriter out = new PrintWriter(System.out);
	    h=in.nextInt();w=in.nextInt();
	    int n=in.nextInt();
	    for(int i=1;i<=n;i++) {
	    	a[i]=in.nextInt();
	    }
	    dfs();
	    for(int i=0;i<h;i++) {
	    	for(int j=0;j<w;j++) {
	    		out.print(map[i][j]);
	    	}
	    	out.println();
	    }
	    out.flush();
	}
	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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
    }
}