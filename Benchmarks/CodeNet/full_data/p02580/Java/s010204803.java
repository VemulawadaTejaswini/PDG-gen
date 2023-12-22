
import java.util.*;
import java.io.*;

public class Main 

{ 

	 static FastReader sc=new FastReader(); 
	 
		  public static void main(String[] args) 
    {
			  HashMap<Integer,Integer> row=new HashMap<Integer, Integer>();
			  HashMap<Integer,Integer> col=new HashMap<Integer, Integer>();
			  int h=i();
			  int w=i();
			  long m=l();
			  int A[][]=new int[h+1][w+1];
			  for(long i=0;i<m;i++) {
				  int r=i();
				  if(row.containsKey(r)) {
					  row.put(r,row.get(r)+1);
				  }
				  else
					  row.put(r,1);
				  int c=i();
				  if(col.containsKey(c)) {
					  col.put(c,col.get(c)+1);
				  }
				  else
					  col.put(c,1);
				  
				  A[r][c]=1;
			  }
			  int maxr=0;
			  int keyr=-1;
			  for(int i : row.keySet()) {
				  int g=row.get(i);
				  if(g>maxr) {
					  maxr=g;
					  keyr=i;
				  }
			  }

			  int maxc=0;
			  int keyc=-1;
			  int keycc=-1;
			  for(int i : col.keySet()) {
				  int cc=col.get(i);
				  if(cc>=maxc) {
					keyc=i;
					if(keycc==-1)
						keycc=keyc;
					  maxc=cc;
					if(A[keyr][i]!=1)
						keycc=i;
					if(col.get(keycc)!=maxc)
						keycc=i;
				  }
				  
			  }
			  if(keycc==-1)
				  keycc=keyc;
			  //System.out.println(keyr+" "+keycc);
			  if(A[keyr][keycc]!=1)
			  System.out.println(maxc+maxr);
			  else
				  System.out.println(maxc+maxr-1);  
			  
			  
    }

		  static int gcd(int a, int b) 
		    { 
		      if (b == 0) 
		        return a; 
		      return gcd(b, a % b);  
		    } 

		  static boolean is(int x)  
		    { 
		        double sr = Math.sqrt(x); 
		      
		        return ((sr - Math.floor(sr)) == 0); 
		    } 

static void input(int A[]) {
	   for(int i=0;i<A.length;i++) {
		   A[i]=sc.nextInt();
	   }
   }
static void input(int A[],int B[]) {
	   for(int i=0;i<A.length;i++) {
		   A[i]=sc.nextInt();
		   B[i]=sc.nextInt();
	   }
}
     static int i() {
    	 return sc.nextInt();
     }
     static String s() {
    	 return sc.next();
     }
     static long l() {
    	 return sc.nextLong();
     }  
        static void shuffleArray(int[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            int tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }   
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
