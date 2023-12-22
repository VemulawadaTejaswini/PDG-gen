import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int ret[] = new int[4];
        Arrays.fill(ret,0);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String c = sc.next();
            int index = 0;
            switch (c) {
                case "AC":
                    index = 0;
                    break;
                case "WA":
                    index = 1;
                    break;
                case "TLE":
                    index = 2;
                    break;
                case "RE":
                    index = 3;
            }
            ret[index]++;
        }
        System.out.println("AC x " + ret[0]);
        System.out.println("WA x " + ret[1]);
        System.out.println("TLE x " + ret[2]);
        System.out.println("RE x " + ret[3]);

    }
}