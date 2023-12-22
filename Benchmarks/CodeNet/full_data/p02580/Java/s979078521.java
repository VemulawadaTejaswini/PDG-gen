

import java.util.*;
import java.io.*;

public class Main 

{ 

	 static FastReader sc=new FastReader(); 
	 
		  public static void main(String[] args) 
    {
			  
			  int h=i();
			  int w=i();
			  int m=i();
			  //int A[][]=new int[h+1][w+1];
			  HashMap<Integer,Integer> m1=new HashMap<>();
			   HashMap<Integer,Integer> m2=new HashMap<>();
			  int row[]=new int[h+1];
			  int col[]=new int[w+1];
			  while(m-- > 0) {
				  int r=i();
				  int c=i();
				  row[r]++;
				  col[c]++;
				  m1.put(r,1);
				  m2.put(c,1);
				  
			  }
			  int maxr=0,maxc=0;
			  int indr=-1,indc=-1;
			  int cc=-1;
			  for(int i=1;i<row.length;i++) {
				  if(row[i]>maxr) {
					  maxr=row[i];
					  indr=i;
				  }
			  }
			  for(int i=0;i<col.length;i++) {
				  if(col[i]>=maxc) {
					  maxc=col[i];
					  indc=i;
					  if(cc==-1)
						  cc=indc;
					  if(m1.containsKey(indr)&&m2.containsKey(indc))
						  cc=indc;
					  if(col[cc]!=maxc)
						  cc=i;
				  }
			  }
	if(m1.containsKey(indr)&&m2.containsKey(cc))
				  System.out.println(maxr+maxc);
			  else
				  System.out.println(maxr+maxc-1);
				  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
//			  long m=l();
//			  int A[][]=new int[h+h][w+w];
//			  int rr[]=new int[(int)m];
//			  int ccc[]=new int[(int)m];
//			  for(int i=0;i<m;i++) {
//				  int r=i();
//				  if(row.containsKey(r)) {
//					  row.put(r,row.get(r)+1);
//				  }
//				  else
//					  row.put(r,(long)1);
//				  int c=i();
//				  if(col.containsKey(c)) {
//					  col.put(c,col.get(c)+1);
//				  }
//				  else
//					  col.put(c,(long)1);
//				  
//				  rr[i]=r;
//				  ccc[i]=c;
//				  A[r][c]=1;
//			  }
//			  long maxr=0;
//			  int keyr=0;
//			  for(int i : rr) {
//				  long g=row.get(i);
//				  if(g>maxr) {
//					  maxr=g;
//					  keyr=i;
//				  }
//			  }
//
//			  long maxc=0;
//			  int keyc=-1;
//			  int keycc=ccc[0];
//			  for(int i : ccc) {
//				  long cc=col.get(i);
//				  if(cc>=maxc) {
//					keyc=i;
//					if(keycc==-1)
//						keycc=i;
//					  maxc=cc;
//					if(A[keyr][i]!=1)
//						keycc=i;
//					if(col.get(keycc)!=maxc)
//						keycc=i;
//				  }
//				  
//			  }
////			  if(keycc==-1)
////				  keycc=keyc;
////			  //System.out.println(keyr+" "+keycc);
////			  long res=maxc+maxr;
////			  if(A[keyr][keycc]!=1)
////			  System.out.println(res);
////			  else
//				  System.out.println(res-1);  
//			  
			  
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



