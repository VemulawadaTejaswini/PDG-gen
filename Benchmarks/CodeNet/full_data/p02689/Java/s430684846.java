import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Main
{
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
    public static void main(String args[])
    {
        FastReader obj = new FastReader();
        int n = obj.nextInt(),m = obj.nextInt(),H[] = new int[n+1];
        for(int i=1;i<n+1;i++) H[i] = obj.nextInt();
        ArrayList<Integer> data[] = new ArrayList[n+1];
        for(int i=1;i<data.length;i++) data[i] = new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            int u = obj.nextInt(),v =obj.nextInt();
            data[u].add(v);
            data[v].add(u);
        }
        int count=0;
        for(int i=1;i<data.length;i++)
        {
            boolean flag = false;
            if(data[i].isEmpty()){count++;continue;}
            for(int j:data[i])
            {
                if(H[i]<=H[j])
                {
                    flag = true;
                    break;
                }
            }
            if(!flag) count++;
        }
        System.out.println(count);
    }
}
