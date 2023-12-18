import java.io.*;
import java.util.*;
public class Main {

    private static void solver(InputReader sc, PrintWriter out) {
           int n = sc.nextInt();
           long k = sc.nextLong();
        int arr[] = new int[n+1];
        for(int i=1; i<=n; i++) arr[i] = sc.nextInt();
        Set<Integer> hs = new HashSet<>();
        List<Integer> al = new ArrayList<>();
        int x = 1;
        al.add(1);
        hs.add(1);
        while(true){
            x = arr[x];
            if(hs.contains(x)){
                break;
            }else {
                hs.add(x);
                al.add(x);
            }
        }
        int size = al.size();
        int rep=0;
       for(int i=0; i<size; i++){
           if(al.get(i)==x) {
               rep = i;
               break;
           }
       }
       if(k < rep) out.println(al.get(rep));
       else{
            k -= rep;
            int modder = (size-rep);
            int mod = (int)(k%modder);
            out.println(al.get(rep+mod));
       }

    }
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
        out.close();
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
        public long nextLong() {
            return Long.parseLong(next());
        }
        public int[] readIntArray(int n){
            int arr[] = new int[n];
            for(int i=0;i<n;i++) arr[i] = nextInt();
            return arr;
        }
    }
}
class Pair{
    int x,y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}