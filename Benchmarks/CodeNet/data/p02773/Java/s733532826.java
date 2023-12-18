import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
        int n = obj.nextInt();
        Map<String,Integer> map = new HashMap<>();
        int max = 1;
        for(int i=0;i<n;i++)
        {
            String str = obj.next();
            if(!map.containsKey(str))
                map.put(str,1);
            else
            {
                int k = map.get(str);
                map.replace(str,k+1);
                k++;
                if(k>=max)
                    max = k;
            }
        }
        ArrayList<String> arr = new ArrayList<>();
        for(Map.Entry<String,Integer>m:map.entrySet())
            if(m.getValue()==max)
                arr.add(m.getKey());
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i));
    }
}
