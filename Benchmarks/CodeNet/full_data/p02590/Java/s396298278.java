import javax.print.attribute.SupportedValuesAttribute;
import java.io.*;
import java.lang.reflect.Array;
import java.security.interfaces.DSAKeyPairGenerator;
import java.util.*;
import java.util.function.Predicate;


public class Main{

    static class TaskB {
        public void solve(InputReader in, PrintWriter out) {
            /*int n = in.nextInt();
            double[] arr = new double[n];
            for(int i = 0; i < n; i++)
            {
                arr[i]= Double.parseDouble(in.next());
            }

            int cnt=0;
            for(int i = 0; i < n; i++)
            {
                for(int g = i+1; g<n; g++)
                {
                    if(arr[i]*arr[g] == Math.floor(arr[i]*arr[g]))
                    {
                        cnt++;
                        out.println(arr[i]+" "+arr[g]);
                    }
                }
            }*/

            int MOD = 200003;
            long sum = 0;
            int n = in.nextInt();
            int[] arr = in.nextIntArray(n);
            for(int i =0; i < n; i++)
            {
                if(arr[i]==0)continue;
                for(int g = i+1; g < n; g++)
                {
                    sum += ((arr[i]%MOD)*(arr[g]%MOD))%MOD;
                }
            }
            out.println(sum);
        }
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(in, out);
        out.close();
    }


    static class Graph
    {
        int V;
        LinkedList<Integer>[] adj;
        HashMap<String, Integer> convert;
        int stringName;
        boolean[] color;
        Graph(int V)
        {
            this.V = V;
            color = new boolean[V];
            adj = new LinkedList[V];
            convert = new HashMap<>();
            stringName = 0;

            for(int i = 0; i < V; i++)
            {
                adj[i] = new LinkedList<>();
            }
        }

        void addEdge(String v, String u)
        {
            if(!convert.containsKey(v))
            {
                convert.put(v, stringName);
                stringName++;
            }
            if(!convert.containsKey(u))
            {
                convert.put(u, stringName);
                stringName++;
            }
            addEdge(convert.get(v), convert.get(u));
        }

        void addEdge(int v, int u)
        {
            adj[v].add(u);
            //adj[u].add(v);  //USE IN UNDIRECTED GRAPHS
        }

        void color(int v) {
            for (int i : adj[v]) {
                color[i] = !color[v];
                color(i);
            }
        }

    }


    static void sort(int[] a)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: a)list.add(i);
        Collections.sort(list);
        for(int i = 0; i < a.length; i++)a[i]=list.get(i);
    }


    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer = new StringTokenizer("");

        public InputReader(InputStream inputStream) {
            this.reader = new BufferedReader(
                    new InputStreamReader(inputStream));
        }

        public String next() {
            while (!tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
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

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
    }
}