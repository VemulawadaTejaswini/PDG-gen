import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        int alwed = sc.nextInt();
        
        
        int count =0, min=Integer.MAX_VALUE;
        int[][] dp_sum = new int[h][w];
        
        String input = sc.next();
        
        dp_sum[0][0] = input.charAt(0)-48;
        for(int j=1; j<w; j++){
            dp_sum[0][j] = dp_sum[0][j-1] + input.charAt(j)-48;
        }
    	for(int i=1; i<h; i++){
    	    input = sc.next();
    	    dp_sum[i][0] = input.charAt(0)-48;
    		for(int j=1; j<w; j++){
                dp_sum[i][j] = dp_sum[i][j-1] + input.charAt(j)-48;
    		}
    	}
    	
    	for(int i=1; i<h; i++){
    		for(int j=0; j<w; j++){
                dp_sum[i][j] += dp_sum[i-1][j];
    		}
    	}
    	/*for(int i=0; i<h; i++){
    		for(int j=0; j<w; j++){
                out.print(dp_sum[i][j]+" ");
    		}
    		out.println();
    	}*/
        
        boolean possible = true;
        int[] break_yoko_l = new int[h];
        int count_yoko_break=0;
    	for(int bit=0; bit < (1<<(h-1)); bit++){
    	    possible=true;
    	    count=0;
    	    count_yoko_break=0;
    	    for(int i=0; i<h-1; i++){
                if((bit&(1<<i)) > 0){
                    break_yoko_l[count_yoko_break] = i;
                    count_yoko_break++;
                    count++;
                }
            }
            for(int i=count_yoko_break; i<h; i++){
                break_yoko_l[count_yoko_break] = h-1;
            }
            
            /*for(int i=0; i<h; i++){
                out.print(break_yoko_l[i]+",");
            }
            out.println();*/
            
            //count_yoko_break=割ったあとの横長個数-1。break___[]割る上のいち
            
            //out.println(count_yoko_break);
            int lastbreak=-1;
            loop_of_leftest:
            for(int i=0; i<w; i++){     //whileの方がいいかも
                if(dp_sum[break_yoko_l[0]][i] > alwed){
                    if(i==0){
                        possible = false;
                        break;
                    }
                    lastbreak = i-1;
                    count++;
                    break;
                }
                for(int j=1; j<=count_yoko_break; j++){
                    if((dp_sum[break_yoko_l[j]][i] - dp_sum[break_yoko_l[j-1]][i]) > alwed){
                        if(i==0){
                            possible = false;
                            break;
                        }
                        lastbreak = i-1;
                        count++;
                        break loop_of_leftest;
                    }
                }
            }
            
            int i=0;
            while(possible&&(lastbreak>=0)){
                loop_other:
                for(i=lastbreak+1; i<w; i++){
                    //out.println(i+" "+lastbreak)
                    if((dp_sum[break_yoko_l[0]][i] - dp_sum[break_yoko_l[0]][lastbreak]) > alwed){
                        if(i==(lastbreak+1)){
                            possible = false;
                            break;
                        }
                        lastbreak = i-1;
                        count++;
                        break;
                    }
                    for(int j=1; j<=count_yoko_break; j++){
                        if((dp_sum[break_yoko_l[j]][i] - dp_sum[break_yoko_l[j]][lastbreak] - dp_sum[break_yoko_l[j-1]][i] + dp_sum[break_yoko_l[j-1]][lastbreak]) > alwed){
                            if(i==(lastbreak+1)){
                                possible = false;
                                break loop_other;
                            }
                            lastbreak = i-1;
                            count++;
                            break loop_other;
                        }
                    }
                }
                if(i==w) break;
            }
            if(possible&&(count<min)) min =count;
    	}
    	out.println(min);
        out.flush();
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
