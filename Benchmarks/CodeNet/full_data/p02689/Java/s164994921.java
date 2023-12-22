import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n,m;
        n=s.nextInt();
        int [] hrr = new int[n];
        m=s.nextInt();
        int [] arr = new int[m];
        int [] brr = new int[m];
        for( int i=0;i<n;i++)
            hrr[i]=s.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer> >(n);
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<Integer>());

        for( int i=0;i<m;i++){
            arr[i]=s.nextInt();
            brr[i]=s.nextInt();
            addEdge(adj,arr[i]-1,brr[i]-1);
        }

        int goodObs=0;
        for (int i = 0; i < adj.size(); i++) {
            int flag=0;
            for (int j = 0; j < adj.get(i).size(); j++) {
                if(hrr[adj.get(i).get(j)]>=hrr[i]){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                goodObs+=1;
        }
        System.out.println(goodObs);
    }

    static void addEdge(ArrayList<ArrayList<Integer> > adj,
                        int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        else if ((n % 2 == 0 && n > 2) || n < 2)
            return false;
        else {
            for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }


    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}