
import java.util.Scanner; 
 import java.text.DecimalFormat; 
 
 
 class Main { 
 public static void main(String[] args) { 
         Scanner scn = new Scanner(System.in); 
            while(scn.hasNext()) { 
            int a = scn.nextInt(); 
            int b = scn.nextInt(); 
            int p = scn.nextInt(); 
            int c = scn.nextInt(); 
            int d = scn.nextInt(); 
            int q = scn.nextInt(); 
            double delta = a * d - b * c; 
            double x = (d * p - b * q) / delta; 
            double y = (a * q - c * p) / delta; 
         String xstr = new DecimalFormat("###0.000").format(x); 
         String ystr = new DecimalFormat("###0.000").format(y); 
         System.out.println(xstr + " " + ystr); 
      } 
   } 
 } 