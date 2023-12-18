import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

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
        int n = fs.nextInt();
        long[][] x_sort = new long[n][3];
        long[][] y_sort = new long[n][3];
        for(int i=0;i<n;i++){
            x_sort[i][0] = y_sort[i][0] = fs.nextInt();
            x_sort[i][1] = y_sort[i][1] = fs.nextInt();
            x_sort[i][2] = y_sort[i][2] = i;
        }
        Arrays.sort(x_sort,new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                if(o1[0] > o2[0]){
                    return 1;
                }else if(o1[0] == o2[0]){
                    return 0;
                }else {
                    return -1;
                }
            }
        });
        Arrays.sort(y_sort,new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                if(o1[1] > o2[1]){
                    return 1;
                }else if(o1[1] == o2[1]){
                    return 0;
                }else {
                    return -1;
                }
            }
        });
        List<LinkedList<Point>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new LinkedList<>());
        }
        for(int i=0;i<n-1;i++){
            graph.get((int)x_sort[i][2]).add(new Point(x_sort[i+1][2],x_sort[i+1][0]-x_sort[i][0]));
            graph.get((int)x_sort[i+1][2]).add(new Point(x_sort[i][2],x_sort[i+1][0]-x_sort[i][0]));
            graph.get((int)y_sort[i][2]).add(new Point(y_sort[i+1][2],y_sort[i+1][1]-y_sort[i][1]));
            graph.get((int)y_sort[i+1][2]).add(new Point(y_sort[i][2],y_sort[i+1][1]-y_sort[i][1]));
        }
        boolean[] used = new boolean[n];

        PriorityQueue<Point> queue = new PriorityQueue<>(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				if(o1.cost > o2.cost){
                    return 1;
                }else if(o1.cost == o2.cost){
                    return 0;
                }else {
                    return -1;
                }
			}
        });
        queue.add(new Point(0,0L));
        long total = 0;
        while(queue.size()>0){
            Point p = queue.poll();
            if(used[(int)p.to])continue;
            used[(int)p.to] = true;
            total+=p.cost;
            for(Point nxt : graph.get((int)p.to)){
                if(!used[(int)nxt.to]){
                    queue.add(nxt);
                }
            }
        }

        System.out.println(total);

    }
    
}

class Point{
    long to,cost;
    Point(long to, long cost){
        this.to = to;
        this.cost = cost;
    }
}