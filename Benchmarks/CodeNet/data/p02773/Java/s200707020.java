import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
* Problem : Poll - C
* Acknowledgement : None
* Author : deathnaught_
* GitHub : www.github.com/DeathNaughT-GitHub
* Complexity : O(N)
*/

public class Main
{

    public static void main(String[] args) 
    {
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        String s[] = new String[T];
        for (int i = 0; i < T; i++) {
            s[i] = sc.next();
        }

        int count = 0;
        HashMap<String, Integer> var = new HashMap<>();
        for (int i = 0; i < T; i++) {
            var.put(s[i], var.get(s[i]) == null ? 1 : var.get(s[i]) + 1);
            if (var.get(s[i]) > count)
            count++;
        }

        String ans[] = new String[T];
        int k = 0;

        for (Map.Entry<String,Integer> entry : var.entrySet())  
        if (count == entry.getValue())
        ans[k++] = "" + (entry.getKey()); 

        for (int i = 0; i < k; i++) {
            for (int j= i + 1; j < k; j++) {
                if (ans[i].compareTo(ans[j]) > 0) {
                    String temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(ans[i]);
        }

    }

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

		boolean hasNext()
		{
		    return st == null ? false : true;
		}

        char nextChar()
        {
            return next().charAt(0);
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

        int[] nextArray(int rows)
        {
            int arr[] = new int[rows];            
            for (int i = 0; i < rows; i++)
            arr[i] = nextInt();
            return arr;
        }

        long[] nextLongArray(int rows)
        {
            long arr[] = new long[rows];            
            for (int i = 0; i < rows; i++)
            arr[i] = nextLong();
            return arr;
        }

        char[] nextCharArray(int rows)
        {
            char arr[] = new char[rows];
            for (int i = 0; i < rows; i++)
            arr[i] = next().charAt(0);
            return arr;
        }

        int[][] nextMatrix(int rows, int columns)
        {
            int mat[][] = new int[rows][columns];
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++)
                {
                    mat[i][j] = nextInt();
                }
            }
            return mat;
        }
    } 

}
