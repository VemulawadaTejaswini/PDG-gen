import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main
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
        FastReader s=new FastReader();
        String st = s.nextLine();
        String tt = s.nextLine();
        
        // if(st.equals(tt)){
        //     System.out.println(0);
        //     return;
        // }

        int max = 0;
        for(int i=0; i<=st.length()-tt.length(); i++){
            int count = 0;
            for(int j=0; j<tt.length(); j++){
                if(st.charAt(i+j)==tt.charAt(j)) count++;
            }
            max = Math.max(max, count);
        }

        System.out.println(tt.length()-max);
        
    }
}