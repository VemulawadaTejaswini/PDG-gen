import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr < buflen){
            return true;
        }else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(buflen <=0){
                return false;
            }
        }
        return true;
    }

    private int readByte(){
        if(hasNextByte())return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c){
        return 33<=c && c<=126;
    }
    public boolean hasNext(){
        while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;
        return hasNextByte();
    }

    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong(){
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b){
            throw new NumberFormatException();
        }
        while(true){
            if('0' <= b && b<='9'){
                n*=10;
                n+=b-'0';
            }else if(b==-1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt(){
        long nl = nextLong();
        if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDoutble(){return Double.parseDouble(next());}
}
public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int h = fs.nextInt();
        int w = fs.nextInt();
        char[][] s = new char[h][w];
        int white = 0;
        for(int i=0;i<h;i++){
            s[i] = fs.next().toCharArray();
            for(int j=0;j<w;j++){
                if(s[i][j]=='.')white++;
            }
        }
        int[][] dist = new int[h][w];

        Queue<int[]> queue = new ArrayDeque<>();
        dist[0][0] = 1;
        int[][] vec = {{0,1},{0,-1},{1,0},{-1,0}};
        queue.add(new int[]{0,0});
        while(queue.size() > 0){
            int[] p = queue.poll();
            int y = p[0];
            int x = p[1];
            for(int i=0;i<4;i++){
                int dx = vec[i][0];
                int dy = vec[i][1];
                if(y+ dy < h && y+dy >=0 && x+dx < w && x+dx>=0){
                    if(dist[y+dy][x+dx]==0){
                        dist[y+dy][x+dx] = dist[y][x] + 1;
                        queue.add(new int[]{y+dy,x+dx});
                    }
                }
            }
        }
        if(dist[h-1][w-1]==0){
            System.out.println(-1);
        }else{
            System.out.println(white-dist[h-1][w-1]);
        }
    }
    
}