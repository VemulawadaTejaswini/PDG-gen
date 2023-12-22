import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main{ 
   static class Fast{
     public BufferedReader br;
     public StringTokenizer st;
     
     public Fast(){
          br =new BufferedReader(new InputStreamReader(System.in));
     }
     
     String next(){
          while(st==null || !st.hasMoreTokens()){
               try{
                    st=new StringTokenizer(br.readLine());
               }
               catch(IOException e){
                    throw new RuntimeException(e);
               }
               
          }
               return st.nextToken();
          }
     int nextInt(){
          return Integer.parseInt(next());
     }
 
     long nextLong(){
          return Long.parseLong(next());
     }
 
     double nextDouble(){
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
   
    static  Fast f=new Fast();
    static PrintWriter out = new PrintWriter(System.out);


    static void readArray(int a[]) 
      {
        
        for (int i=0;i<a.length;i++ ) a[i]=f.nextInt();
        
      }
    
    
     
  public static void main(String[] args)throws Exception{
  //StringTokenizer st;//! @ % & * () _ {} # ~ : < > ? "" | ^
         
 
        //StringBuilder res=new StringBuilder();

         int primes[]=new int[1000010];
              primes[0]=0;
              primes[1]=1;
              for (int i=2;i*i<=primes.length;i++ ) {
                if (primes[i]==0) {
                  primes[i]=i;
                  for (int j=i*i;j<primes.length ;j+=i ) {
                    if (primes[j]==0) {
                      primes[j]=i;
                    }
                    
                  }
                }
              }
               
          
              for (int i=2;i<primes.length;i++ ) {
                if (primes[i]==0) {
                  primes[i]=i;
                  //l.add(i);
                }
              }


         int n=f.nextInt();
  
       
       // while(t-->0){

         long ans=0;
        
          for (int c=1;c<n ;c++ ) {
            int k=n-c;
            long ans2=1;
            while(primes[k]!=1) {
              int temp=primes[k];
              int count=0;
              while(temp==primes[k]) {
                count++;
                k/=temp;
              }
              ans2*=(count+1);
            }
            ans+=ans2;
          }

          out.println(ans);
          
         
        
          
      //  }
          
   
        

        out.close();
 
}
}