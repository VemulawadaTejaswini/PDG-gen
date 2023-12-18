import java.io.*;
import java.util.*;

class FastReader 
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

class Solution
{
    void solve()
    {
        FastReader sc = new FastReader();

        int N = sc.nextInt(); //number of problems
        int M = sc.nextInt(); //number of submissions
        
        ArrayList<String>arr = new ArrayList<>(); //stores the verdict;

        //intialize all to unsolved

        for(int i = 0; i < N ; i++)
            arr.add("US");

        int ac = 0, pen = 0; //ac and penalty

        for(int i = 0; i < M; i++)
        {
            int no = sc.nextInt(); //question number
            no--; //index

            String status = sc.next();

            //System.out.println();

            //System.out.println(arr.get(no) + " " + status);


            if(arr.get(no).equals("US") && status.equals("WA"))
            {
                //System.out.println('A');

                pen++;
                arr.set(no,"WA");
            }

            else if(arr.get(no).equals("US") && status.equals("AC"))
            {
                //System.out.println('B');

                ac++;
                arr.set(no,"AC");
            }
            
            else if(arr.get(no).equals("WA") && status.equals("AC"))
            {
                //System.out.println('C');

                ac++;
                arr.set(no,"AC");
            }

            else if(arr.get(no).equals("WA") && status.equals("WA"))
            {
                //System.out.println('D');

                pen++;
            }
        }

        //System.out.println(arr);

        System.out.println(ac + " " + pen);

    }
}
  
public class Main 
{ 
    public static void main(String[] args) 
    { 
        Solution ob = new Solution();

        ob.solve();
    } 
} 