import java.util.Scanner;

public class Tables{

     public static void main(String []args){
      int a, b, c, d;
 
     a = 1;
     b = 9;
     for (c = a; c <= b; c++) {
      
      for (d = 1; d < 10; d++) {
         System.out.println(c+"*"+d+" = "+(c*d));
      }
    }
     }
    
}