import java.util.*;
import java.io.*;
 
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        int count_white=0;
        
        String in_line = new String();
        
        boolean[][] is_aisle = new boolean[h][w];
        int[][] d = new int[h][w];
        
        for(int i=0; i<h; i++){
            in_line = sc.next();
            for(int j=0; j<w; j++){
                is_aisle[i][j] = (in_line.charAt(j) == '.') ? true : false;
                if(is_aisle[i][j]) count_white++;
                d[i][j] = -1;
            }
        }
        ArrayDeque<Integer> todoX = new ArrayDeque<>();
        ArrayDeque<Integer> todoY = new ArrayDeque<>();
        todoX.add(0);
        todoY.add(0);
        d[0][0] = 1;
        
        int[] tmpltX = {1,-1,0,0};
        int[] tmpltY = {0,0,1,-1};
        
        int x=-1, y = -1, nextX = -1, nextY = -1;
        
        while(todoX.size() > 0){
            x = todoX.removeFirst();
            y = todoY.removeFirst();
            for(int i=0; i < 4; i++){
                nextX = x+tmpltX[i];
                nextY = y+tmpltY[i];
                if((nextX >= 0) && (nextY >= 0) && (nextX < w) && (nextY < h)){
                    if(is_aisle[nextY][nextX] && (d[nextY][nextX] <0)){
                        todoX.add(nextX);
                        todoY.add(nextY);
                        d[nextY][nextX] = d[y][x]+1;
                    //out.println(nextX +","+nextY+" d:"+d[nextY][nextX]);
                    }
                }
            }
        }
        
        /*for(int i=0; i<n_v; i++){
            out.println((i+1) + " " + d_from1[i]);
        }*/
        out.println(count_white-d[h-1][w-1]);
        out.flush();
    }
    
    static void show_b2d_array(boolean[][] dt){
    	for(int i=0; i<dt.length; i++){
    		for(int j=0; j<dt[0].length; j++){
    		    if(dt[i][j]) System.out.print("O");
    		    else System.out.print(".");
    		}
    		System.out.println();
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