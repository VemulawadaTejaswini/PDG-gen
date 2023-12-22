import java.util.*;
import java.io.*;

public class Main
{   
    public static void main(String[] args) throws IOException
    {
        Foster sc = new Foster();
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        int N[] = sc.intArray(n);
        int M[] = sc.intArray(m);
        N[n] = Integer.MAX_VALUE;
        M[m] = Integer.MAX_VALUE;
        int[] arr = new int[n+m];
        int p1 = 0, p2 = 0;
        for(int i = 0; i < (m+n); i++)
        {
            if(N[p1] < M[p2])
            {
                arr[i] = N[p1++];
            }
            else
            {
                arr[i] = M[p2++];
            }
        }
        int count = 0;
        for(int i = 0; i < (m+n); i++)
        {
            if(k - arr[i] >= 0)
            {
                count++;
                k -= arr[i];
            }
            else
                break;
        }
        System.out.println(count);
    }

    static class Foster 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() 
        {
            while (!st.hasMoreTokens())
                try 
                {
                    st = new StringTokenizer(br.readLine());
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
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
        int[] intArray(int n)
        {
            int arr[] = new int[n+1];
            for(int i = 0; i < n; i++)
            {
                arr[i] = nextInt();
            }
            return arr;
        }
        long[] longArray(int n)
        {
            long arr[] = new long[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}