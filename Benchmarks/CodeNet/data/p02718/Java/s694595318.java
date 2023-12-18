import java.util.*;
import java.io.*;
import java.lang.*;
class Main  {
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
    public static void main(String[] args) {
        FastReader ob = new FastReader();
        int n = ob.nextInt();
        int m = ob.nextInt();
        int arr[] =  new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
            sum+=arr[i];
        }
        int count=0;
        double limit=(double)sum/(4*m);
        for (int i = 0; i <n ; i++) {
            if((double)arr[i]>=limit){
                count++;
            }
        }
        if(count>=m){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }



    }
}