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

         // int t=f.nextInt();
  
       
       // while(t-->0){

          StringBuilder res=new StringBuilder();

          String s=f.next();
          res.append(s);
          if (s.charAt(s.length()-1)=='s') {
            res.append("es");
          }
          else res.append("s");
           out.println(res);
      //  }
   
        //

        out.close();
 
}
}