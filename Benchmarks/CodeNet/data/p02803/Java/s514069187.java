import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.LinkedList;

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

public class Main {

    public static void main(String[] args) {
	    // write your code here
        final int UNCHECKED = -1;
        final int WALL = -2;
        FastScanner fs = new FastScanner();

        int height = fs.nextInt();
        int width = fs.nextInt();

        boolean[][] map = new boolean[20][20]; //(h,w)
        String mapLineTmp;

        for(int h = 0 ; h < height ; h++){
            mapLineTmp = fs.next();
            for(int w = 0 ; w < width ; w++){
                map[h][w] = mapLineTmp.charAt(w) == '.' ? true : false;
            }
        }

        int maxLength = 0;
        for(int h0 = 0 ; h0 < height ; h0++){
            for(int w0 = 0 ; w0 < width ; w0++){
                if(map[h0][w0] == false){
                    continue;
                }
                int[][] maze = new int[20][20];
                for(int h = 0 ; h < height ; h++){
                    for(int w = 0 ; w < width ; w++){
                        maze[h][w] = map[h][w] == true ? UNCHECKED : WALL;
                    }
                }
                LinkedList<Integer> queue = new LinkedList<Integer>();
                maze[h0][w0] = 0;
                queue.push(h0*width+w0);
                while(!queue.isEmpty()){
                    int pos = queue.pop();
                    int h = pos/width;
                    int w = pos % width;

                    if(h > 0){
                        if(maze[h-1][w] == UNCHECKED || maze[h-1][w] > maze[h][w]+1){
                            maze[h-1][w] = maze[h][w] + 1;
                            queue.push((h-1)*width+w);
                        }
                    }
                    if(h < height-1){
                        if(maze[h+1][w] == UNCHECKED || maze[h+1][w] > maze[h][w]+1){
                            maze[h+1][w] = maze[h][w] + 1;
                            queue.push((h+1)*width+w);
                        }
                    }
                    if(w > 0){
                        if(maze[h][w-1] == UNCHECKED || maze[h][w-1] > maze[h][w]+1){
                            maze[h][w-1] = maze[h][w] + 1;
                            queue.push(h*width+w-1);
                        }
                    }
                    if(w < width - 1){
                        if(maze[h][w+1] == UNCHECKED || maze[h][w+1] > maze[h][w]+1){
                            maze[h][w+1] = maze[h][w] + 1;
                            queue.push(h*width+w+1);
                        }
                    }
                }
                for(int h = 0 ; h < height ; h++){
                    for(int w = 0 ; w < width ; w++){
                        maxLength = maxLength < maze[h][w] ? maze[h][w] : maxLength;
                    }
                }
            }
        }
        System.out.println(maxLength);
    }
}