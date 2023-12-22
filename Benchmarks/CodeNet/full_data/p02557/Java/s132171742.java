
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    private static FastReader fr = new FastReader();
    private static PrintWriter out=new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // code goes here
        int n = fr.nextInt();
        int[] a = fr.nextIntArray(n);
        int[] b = fr.nextIntArray(n);
        int[] counts1 = new int[n + 1];
        int[] counts2 = new int[n + 1];
        for(int i = 0; i < n; i++){
            counts1[a[i]]++;
            counts2[b[i]]++;
        }
        boolean allowed = true;
        for(int i = 1; i <= n; i++){
            int min = Math.min(counts1[i], counts2[i]);
            if(min > n/2){
                allowed = false;
                break;
            }
        }
        if(!allowed){
            sb.append("No");
        } else {
            sb.append("Yes\n");
            LinkedList<Integer> linkedList = new LinkedList<>();
            for(int i = 0; i < n; i++){
                linkedList.add(b[i]);
            }
            int[] c = new int[n];
            int index = 0;
            for(int i = 0; i < n; i++){
                while (linkedList.getFirst() == a[i]){
                    int x = linkedList.getFirst();
                    linkedList.removeFirst();
                    linkedList.add(x);
                }
                c[index] = linkedList.getFirst();
                linkedList.removeFirst();
                index++;
            }

            for(int i = 0; i < n; i++){
                sb.append(c[i]).append(" ");
            }
        }
        System.out.print(sb.toString());
    }

    static class FastReader{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] nextLongArray(int n) {
            long[] a=new long[n];
            for (int i=0; i<n; i++) a[i]=nextLong();
            return a;
        }
    }

    static class Pair<A, B>{
        A first;
        B second;
        public Pair(A first, B second){
            this.first = first;
            this.second = second;
        }
    }
}
