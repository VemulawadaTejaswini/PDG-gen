import java.util.*;
import java.io.*;
 
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int pay = sc.nextInt();
        int n = sc.nextInt();
        int[] f_val = new int[n];
        
    	for(int i=0; i<n; i++){
    	    f_val[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(f_val);
    	
    	int[] n_lim = new int[n];
    	for(int i=0; i<n; i++){
    	    n_lim[i] = Integer.MAX_VALUE;
    		for(int j=i+1; j<n; j++){
    		    if(f_val[j]%f_val[i] == 0){
    		        n_lim[i] = f_val[j] / f_val[i];
    		        break;
    		    }
    		}
    	}
        
        int[] dp = new int[pay+1];     //丁度w円にする時の最小枚数
        
        dp[0]=0;
        int c=0;
    	for(int j=1; j<=pay; j++){
    	    dp[j] = Integer.MAX_VALUE;
    	    for(int i=0; i<n; i++){
    		    c=1;
    		    while((j >= f_val[i]*c) && (c < n_lim[i])){
                    if((dp[j-(f_val[i]*c)]+c) < dp[j]) dp[j] = (dp[j-(f_val[i]*c)]+c);
    		        c++; 
    		    }
    		}
    	}
        //show_i2d_array(dp);
        out.println(dp[pay]);
        out.flush();
    }
    
    private static int max(int a, int b){
        if(a>b) return a;
        else return b;
    }
    
    
    static void show_i2d_array(int[][] dt){
        PrintWriter out = new PrintWriter(System.out);
    	for(int i=0; i<dt[0].length; i++){
    		for(int j=0; j<dt.length; j++){
    		    out.print(dt[j][i]+",");
    		}
    		out.println("<-w="+i);
    	}
    	out.flush();
    }
    
    public static void combSort(int[][] origin, int ln){
        int h=ln*10/13, tmp=0;
        boolean fin=true;
        while((h>1)||(!fin)){
            fin=true;
            for(int i=0; i < ln-h; i++){
                if(origin[i][0] > origin[i+h][0]){
                    tmp=origin[i][0];
                    origin[i][0]=origin[i+h][0];
                    origin[i+h][0]=tmp;
                    tmp=origin[i][1];
                    origin[i][1]=origin[i+h][1];
                    origin[i+h][1]=tmp;
                    fin=false;
                }
            }
            h *=10;
            h/=13;
        }
    }
}
 
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
