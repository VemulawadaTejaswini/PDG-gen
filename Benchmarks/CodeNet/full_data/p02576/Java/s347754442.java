
import java.util.*;



import java.io.*;
public class Main {

	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next()
        {
            while(st==null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e)
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
        
        String nextLine()
        {
            String s = "";
            
            try
            {
                s = br.readLine();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            return s;
        }
    }
    
    public static void main(String[] args) throws java.lang.Exception
    {
        try
        {
            FastReader fr = new FastReader();
            int n = fr.nextInt();
            int x=fr.nextInt();
            int t=fr.nextInt();
           int time=0;
            time=(int)Math.ceil((double)n/x);
            System.out.print(time*t);
            
            
        }
        catch(Exception e){}
        finally{}

	}

}
