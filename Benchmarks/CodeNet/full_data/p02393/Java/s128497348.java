import java.io.*;

public class Main{
   public static void main(String [] args){
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int a,b,c;
      String[] arange=null;
     try{ 
      arange = in.readLine().split(" ", 0);
     }catch (Exception e){
     }
      a = Integer.parseInt(arange[0]);
      b = Integer.parseInt(arange[1]);
      c = Integer.parseInt(arange[2]);
      if(a<=b&&a<=c){
        if(b<c)
          System.out.println(a+" "+b+" "+c);
        else
           System.out.println(a+" "+c+" "+b);
      }else  if(b<=a&&b<=c){
        if(a<c)
          System.out.println(b+" "+a+" "+c);
        else
          System.out.println(b+" "+c+" "+a);
      }else{
        if(a<b)
          System.out.println(c+" "+a+" "+b);
        else
          System.out.println(c+" "+b+" "+a);
      }

   }
}
