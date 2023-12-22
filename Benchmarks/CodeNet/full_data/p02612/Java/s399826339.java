import java.util.*;
import java.io.*;
public class Main{
 public static void main(String agrs[])
 {
   Scanner in = new Scanner(System.in);
   PrintWriter out = new PrintWriter(System.out);
   int n = in.nextInt();
   if(n % 1000 == 0)
   {
     out.println(0);
   }
   else
   {
     out.println((n / 1000 + 1) * 1000 - n);
   }
   out.close();
 }
}