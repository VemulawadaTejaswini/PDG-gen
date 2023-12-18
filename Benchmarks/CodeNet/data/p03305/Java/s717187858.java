import java.util.*;
import java.io.*;
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
        int m = fs.nextInt();
        int s = fs.nextInt()-1;
        int t = fs.nextInt()-1;
        List<List<Road>> graph = new ArrayList<>();

        for(int i=0;i<n;i++)graph.add(new LinkedList<>());

        int from,to;
        long a,b;
        for(int i=0;i<m;i++){
            from = fs.nextInt()-1;
            to = fs.nextInt()-1;
            a = fs.nextLong();
            b = fs.nextLong();
            graph.get(from).add(new Road(to,a,b));
            graph.get(to).add(new Road(from,a,b));
        }
        long[] cost = new long[n];
        long inf = 1000000000000000L;
        Arrays.fill(cost,inf);
        PriorityQueue<Road> queue = new PriorityQueue<>(new Comparator<Road>() {

			@Override
			public int compare(Road o1, Road o2) {
				if(o1.a > o2.a){
                    return 1;
                }else if(o1.a == o2.a){
                    return 0;
                }else{
                    return -1;
                }
			}
        });

        queue.add(new Road(s,0,0));
        while(!queue.isEmpty()){
            Road r = queue.poll();
            if(r.a >= cost[r.to])continue;
            cost[r.to] = r.a;
            for(Road road : graph.get(r.to)){
                if(cost[r.to] + road.a < cost[road.to]){
                    queue.add(new Road(road.to,cost[r.to] + road.a ,0));
                }
            }
        }

        queue = new PriorityQueue<>(new Comparator<Road>() {
			@Override
			public int compare(Road o1, Road o2) {
				if(o1.b > o2.b){
                    return 1;
                }else if(o1.b == o2.b){
                    return 0;
                }else{
                    return -1;
                }
			}
        });
        long[] r_cost = new long[n];
        Arrays.fill(r_cost,inf);
        queue.add(new Road(t,0,0));
        while(!queue.isEmpty()){
            Road r = queue.poll();
            if(r.b >= r_cost[r.to])continue;
            r_cost[r.to] = r.b;
            for(Road road : graph.get(r.to)){
                if(r_cost[r.to] + road.b < r_cost[road.to]){
                    queue.add(new Road(road.to,0,r_cost[r.to] + road.b));
                }
            }
        }
        long[][] total = new long[n][2];

        for(int i=0;i<n;i++){
            total[i][0] = cost[i] + r_cost[i];
            total[i][1] = i+1;
        }
        Arrays.sort(total,new Comparator<long[]>(){
            @Override
            public int compare(long[] o1, long[] o2) {
                if(o1[0] > o2[0]){
                    return 1;
                }else if(o1[0] == o2[0]){
                    return 0;
                }else{
                    return -1;
                }
            }
        });
        PrintWriter out = new PrintWriter(System.out);
        int idx = 0;
        long money = 1000000000000000L;
        for(int i=0;i<n;i++){
            while(i >= total[idx][1])idx++;
            out.println(money-total[idx][0]);
        }
        out.flush();
    }
    
}
class Road{
    int to;
    long a,b;
    Road(int to ,long a,long b){
        this.to = to;
        this.a = a;
        this.b = b;
    }
}
