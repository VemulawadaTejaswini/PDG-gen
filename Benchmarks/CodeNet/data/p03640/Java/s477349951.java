import java.io.*;
import java.util.*;
public class Main {
	static final int N=10005;
	static int a[]=new int[N];
    static int map[][]=new int[105][105];
	static int h,w,x,y;
    static int dfs(int cnt,int id,int dir) {
    	int pre=dir,first=1,s;
    	for(int i=x;i<h;i++) {
    		if(first==1) {
    			s=y;first=0;
    		}else{
    			if(pre==0) s=0;
    			else s=w-1;
    		}
    		if(pre==0) {
    			for(int j=s;j<w;j++) {
    			if(cnt==0) {
    				x=i;y=j;
    				return pre;
    			}
    			map[i][j]=id;
    			cnt--;
    			}
    			pre=1-pre;
    		}
    		else {
    			for(int j=s;j>=0;j--) {
        			if(cnt==0) {
        				x=i;y=j;
        				return pre;
        			}
        			map[i][j]=id;
        			cnt--;
        			
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
	    x=0;y=0;int pre=0;
	    for(int i=0;i<n;i++) {
	    	int tmp=in.nextInt();
	        pre=dfs(tmp,i+1,pre);
	     //   out.println(x+" wadwa "+y+" "+pre);
	    }
	    for(int i=0;i<h;i++) {
	    	for(int j=0;j<w;j++) {
                       if(j>0) out.print(" ");
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