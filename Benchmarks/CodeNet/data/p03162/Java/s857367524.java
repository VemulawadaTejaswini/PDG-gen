import java.io.*;
import java.util.*;

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

 }
  
	public static void main(String[] args)throws Exception{
         //StringTokenizer st;//! @ % & * () _ {} # ~ : < > ? "" | ^
          Fast f=new Fast();
         PrintWriter out = new PrintWriter(System.out);
        // StringBuilder str=new StringBuilder();
         //  int x=Integer.parseInt(st.nextToken());
         
        //st=new StringTokenizer(br.readLine()); 

        
        int n=f.nextInt();
        int ans[]=new int[3];
        int a=0,b=0,c=0;
        for (int i=0;i<n;i++ ) {
            a=f.nextInt()+Math.max(ans[1],ans[2]);
            b=f.nextInt()+Math.max(ans[0],ans[2]);
            c=f.nextInt()+Math.max(ans[0],ans[1]);
            ans[0]=a;
            ans[1]=b;
            ans[2]=c;
        }
        
        int mh=Math.max(Math.max(ans[0],ans[1]),ans[2]);
        
        out.println(mh);
    out.close();

}
}


