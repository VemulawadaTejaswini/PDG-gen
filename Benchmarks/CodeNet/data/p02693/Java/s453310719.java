import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
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
                    catch (IOException e)
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
    public static void main(String[] args) {
        FastReader ob = new FastReader();
        int k=ob.nextInt(),a=ob.nextInt(),b=ob.nextInt();
        int ans=(a-(a%k))+k;
        if(ans>=a && ans<=b || a%k==0){
            System.out.println("OK");
            return;
        }
        System.out.println("NG");
    }
}
