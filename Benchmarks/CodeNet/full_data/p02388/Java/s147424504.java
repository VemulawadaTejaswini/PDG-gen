import java.io.*;
class Main{
   public static void main(String[] args){
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

       String s = r.readLine();        // ??????????????\???
       int a = Integer.parseInt(s);    // ??´??°?????????

       System.out.println(a*a*a);
   }
}