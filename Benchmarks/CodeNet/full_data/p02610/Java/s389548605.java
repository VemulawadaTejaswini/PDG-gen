import java.util.*;
import java.io.*;
import java.util.stream.*;
 
public class Main {
    static Comparator<Camel> listComp = Comparator.comparing(Camel::getN);
    static Comparator<Camel> queueComp = Comparator.comparing(Camel::getP);
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int tt = sc.nextInt();
        for(int t = 0; t < tt; t++){
            int n = sc.nextInt();
            List<Camel> ll = new ArrayList<>();
            List<Camel> rl = new ArrayList<>();
            long ans = 0;
            for(int i = 0; i < n; i++){
                int k = sc.nextInt();
                int l = sc.nextInt();
                int r = sc.nextInt();
                ans += Math.min(l,r);
                if(l > r){
                    ll.add(new Camel(k,l-r));
                }else if(l < r){
                    rl.add(new Camel(n-k,r-l));
                }
            }
            ans += getMax(ll);
            ans += getMax(rl);
            System.out.println(ans);
        }
    }
    
    public static long getMax(List<Camel> li){
        long ret = 0;
        li = li.stream().sorted(listComp).collect(Collectors.toList());
        PriorityQueue<Camel> pq = new PriorityQueue<Camel>(queueComp);
        for(Camel c : li){
            if(c.getN() > pq.size()){
                pq.add(c);
            }else{
                if(pq.isEmpty()){
                    continue;
                }
                Camel pc = pq.poll();
                if(pc.getP() <= c.getP()){
                    pq.add(c);
                }else{
                    pq.add(pc);
                }
            }
        }
        while(pq.size() > 0){
            ret += pq.poll().getP();
        }
        return ret;
    }
}

class Camel{
    private int n;
    private long p;
    public Camel(int n, long p){
        this.n = n;
        this.p = p;
    }
    
    public long getN(){
        return this.n;
    }
    
    public long getP(){
        return this.p;
    }
}


class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
