import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
 
 
public class hello
 {static class FastReader 
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
    
    static String sum (String s)
    {
        String s1 = ""; 
        
        if(s.contains("a"))
            s1+="a";
        if(s.contains("e"))
            s1+="e";
        if(s.contains("i"))
            s1+="i";
        if(s.contains("o"))
            s1+="o";
        if(s.contains("u"))
            s1+="u";
        
            return s1;
            
        
    }
    
 
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
    
    
public static void main(String args[])
    {
        FastReader input =new FastReader();
      
        final int h = input.nextInt();
        final int n = input.nextInt();
        final int[] a = new int[n];
        final int[] b = new int[n];
        int max = 0;
     
        for (int i = 0; i < n; i++) {
          a[i] = input.nextInt();
          b[i] = input.nextInt();
          max = Math.max(max, a[i]);
        }
     
        final long[][] dp = new long[n][h+max];
     
        dp[0][0] = b[0];
        
        
        for (int i = 1; i < h+max; i++) {
          dp[0][i] = b[0] * (long) Math.ceil((double) i /(double) a[0]);
        }
        
        
        
        for (int i = 1; i < n; i++) {
          for (int j = 0; j < h+max ; j++) {
            if(j > a[i]) {
              dp[i][j] = Math.min(dp[i][j-a[i]] + b[i] , dp[i-1][j]);
            } else {
              dp[i][j] = Math.min(dp[i-1][j], b[i]);
            }
          }
        }
     
        long min = Long.MAX_VALUE;
        for (int i = h; i < h+max; i++) {
          min = Math.min(min, dp[n-1][i]);
        }
        System.out.println(min);
     
//        for (int i = 0; i < n; i++) {
//          for (int j = 0; j < h + max; j++) {
//            System.out.print(dp[i][j]);
//          }
//          System.out.println();
//        }
    }
        
        
        
        
        
    
        
      
        
   
        
        
        
        
        
  
	

	
 
 
static boolean find(int a[],int A,int B)
	{
		if( root(a,A)==root(a,B) )       //if A and B have the same root, it means that they are connected.
			return true;
		else
			return false;
	}
 
 
 
 
 
	static void union(int Arr[],int size[],int A,int B)
	{
		int root_A = root(Arr,A);
		int root_B = root(Arr,B);
		
		
		if(root_A == root_B)
		{
			return;
		}
		if(size[root_A] < size[root_B] )
		{
			Arr[ root_A ] = Arr[root_B];
			size[root_B] += size[root_A];
			size[root_A] = 0;	
			
		}
		else
		{
			Arr[ root_B ] = Arr[root_A];
			size[root_A] += size[root_B];
			size[root_B] = 0;
			
 
			
			
			
		}
 
	}
	
	
	
	static int root (int Arr[ ] ,int i)
	{
		while(Arr[ i ] != i)          
        {
			i = Arr[ i ];
        }
        return i;
	}
	static long factorial(long n)
    {
        long fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
 }
 
 
 class Pair
 {
     int a;
     int b;
     Pair(int a,int b)
     {
         this.a=a;
         this.b=b;
     }
 }