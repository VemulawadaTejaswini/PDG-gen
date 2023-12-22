import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
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
 
        int[] readArray(int n, int size){
            int[] a = new int[size];
            for(int i = 0; i < n; i++) {
                a[i] = this.nextInt();
            }
 
            return a;
        }
 
        long[] readLongArray(int n, int size){
            long[] a = new long[size];
            for(int i = 0; i < n; i++) {
                a[i] = this.nextLong();
            }
            return a;
        }
    }
 
 
 
    public static void main(String[] args) {
        FastReader s=new FastReader();
        String input = s.next();
 
        int count = 0;
        int result = count;
        for(int i = 0; i < input.length(); i++) {
 
            if(input.charAt(i) == 'R') count++;
            else {
                count = 0;
            }
 
            result = Math.max(result,count);
        }
        System.out.println(result);
    }
}