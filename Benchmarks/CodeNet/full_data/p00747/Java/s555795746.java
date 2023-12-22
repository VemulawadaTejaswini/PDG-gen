import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int in_num=0;
        while(true){
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w==0) break;
        
            boolean[][] wall_l = new boolean[h][w-1];    
            boolean[][] wall__ = new boolean[h-1][w];
        
            int[][] d = new int[h][w];
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    d[i][j] = 0;
                }
            }
            d[0][0] = 1;
            
            for(int i=0; i<h-1; i++){
                for(int j=0; j<w-1; j++){
                    in_num = sc.nextInt();
                    wall_l[i][j] = (in_num == 0) ? false : true;
                }
                
                for(int j=0; j<w; j++){
                    in_num = sc.nextInt();
                    wall__[i][j] = (in_num == 0) ? false : true;
                }
            }
            
            for(int j=0; j<w-1; j++){
                in_num = sc.nextInt();
                wall_l[h-1][j] = (in_num == 0) ? false : true;
            }
        
            ArrayDeque<Integer> todoX = new ArrayDeque<>();
            ArrayDeque<Integer> todoY = new ArrayDeque<>();
            
            
            todoX.add(0);
            todoY.add(0);
            
            int x=-1, y = -1, nextX = -1, nextY = -1;
        
            while(todoX.size() > 0){
                x = todoX.removeFirst();
                y = todoY.removeFirst();
                
                if(x>0){
                    if((!wall_l[y][x-1]) && (d[y][x-1] == 0)){
                        d[y][x-1] = d[y][x]+1;
                        todoX.add(x-1);
                        todoY.add(y);
                    }
                }
                if(x < (w-1)){
                    if((!wall_l[y][x]) && (d[y][x+1] == 0)){
                        d[y][x+1] = d[y][x]+1;
                        todoX.add(x+1);
                        todoY.add(y);
                    }
                }
                if(y>0){
                    if((!wall__[y-1][x]) && (d[y-1][x] == 0)){
                        d[y-1][x] = d[y][x]+1;
                        todoX.add(x);
                        todoY.add(y-1);
                    }
                }
                if(y < (h-1)){
                    if((!wall__[y][x]) && (d[y+1][x] == 0)){
                        d[y+1][x] = d[y][x]+1;
                        todoX.add(x);
                        todoY.add(y+1);
                    }
                }
            }
            
            out.println(d[h-1][w-1]);
        }
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
    static void show_i2d_array(int[][] dt){
    	for(int i=0; i<dt.length; i++){
    		for(int j=0; j<dt[0].length; j++){
    		    System.out.print(dt[i][j]);
    		}
    		System.out.println();
    	}
    }
    
    public static boolean[] intToBool(int a){
        boolean[] bs = new boolean[32];
        for(int dig=0; dig<32; dig++){
            bs[dig] = ((a&(1<<dig)) > 0) ? true : false;
        }
        return bs;
    }
    
    
    
    public static int binarySearchMax(int[] dt, int target){
        int left=-1, right=dt.length;
        int mid=-1;
        
        while((right-left)>1){
            mid = left + (right-left)/2;
            
            if(dt[mid] <= target){
                left=mid;
            }else{
                right=mid;
            }
        }
        return left;  //target以下の最大のaddress
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
