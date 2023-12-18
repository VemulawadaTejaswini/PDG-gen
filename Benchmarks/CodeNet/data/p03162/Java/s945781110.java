/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
  HashMap<String, Integer> map 
            = new HashMap<>(); 
  	
	public static void main (String[] args) throws java.lang.Exception
	{
      	FastReader s = new FastReader();
		int  n = s.nextInt();
      	
		int arr[][] = new int[n][3];
		for(int i=0;i<n;i++)
          for(int j=0;j<3;j++)
		arr[i][j]= s.nextInt();
		Main ob = new Main();
		int ans = ob.getH(n-1,arr,1,1,1);
      	System.out.println(ans);
	}
  int maxim (int x, int y, int z){
  int m = Math.max(x,y);
    return Math.max(m,z);
  }
  int getH(int n,int arr[][], int a, int b, int c){
    int res=0;
    String key = ""+Integer.toString(n)+Integer.toString(a)+Integer.toString(b)+Integer.toString(c);
  	if(n==0){
      res=maxim(a*arr[0][0],b*arr[0][1],c*arr[0][2]);
      map.put(key ,res);
    return map.get(key);
  }
    if(map.containsKey(key)) return map.get(key);
    res=maxim(a==1?(arr[n][0]+getH(n-1,arr,0,1,1)):0,
                b==1?(arr[n][1]+getH(n-1,arr,1,0,1)):0,
                c==1?(arr[n][2]+getH(n-1,arr,1,1,0)):0);
    
    map.put(key ,res);
    return map.get(key);
  }


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
}
