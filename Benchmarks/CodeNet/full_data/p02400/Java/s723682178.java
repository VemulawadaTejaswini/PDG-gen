import java.util.*;
import java.io.*;

public class Main{
 public static void main(String[] args) throws IOException
 {
   Scanner sc = new Scanner(System.in);
   InputStreamReader is = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(is);
   
   String inStr = br.readLine();
   double r = Double.parseDouble(inStr);
 
    System.out.printf("%.6f", r*r*Math.PI);
    System.out.print(" ");
    System.out.printf("%.6f", 2*r*Math.PI);
    System.out.println("");
 }
}