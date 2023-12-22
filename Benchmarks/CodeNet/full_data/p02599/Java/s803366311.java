import java.io.*;
import java.util.*;

public class Main {

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tok;

        public InputReader(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
            tok = null;
        }

        public InputReader(String inputFile) throws FileNotFoundException {
            reader = new BufferedReader(new FileReader(inputFile));
            tok = null;
        }

        public String nextLine() {
            String c = "";
            try {
                c = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            return c;
        }

        public String next() {
            while (tok == null || !tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(nextLine());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String args[]) {
        InputStream inputstream = System.in;
        OutputStream outputstream = System.out;
        InputReader in = new InputReader(inputstream);
        PrintWriter out = new PrintWriter(outputstream);
        Task solver = new Task();
        solver.solve(in, out);
        out.flush();
    }

    static class Task {
        public void solve(InputReader in, PrintWriter out) {
            int t = in.nextInt();
            int q=in.nextInt();
            int[] arr=new int[t];
            for(int i=0;i<t;i++)
            arr[i]=in.nextInt();
            int[][] query=new int[q][2];
            for(int i=0;i<q;i++)
            for(int j=0;j<2;j++)
            query[i][j]=in.nextInt();
            int[] ans=new int[q];
            for(int i=0;i<q;i++){
                Set<Integer> set=new HashSet<>();
                int l=query[i][0]-1;
                int r=query[i][1]-1;
                for(int j=l;j<=r;j++)
                set.add(arr[j]);
                ans[i]=set.size();
            }
            for(int a:ans)
            out.println(a);
        }
    }
}