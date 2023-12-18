import java.io.*;
import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
 
    try {
      // 標準入力受け取り
      Scanner scan = new Scanner(System.in);      
      Long    tax1    = Long.parseLong(scan.next());
      Long    tax2    = Long.parseLong(scan.next());
      double  price1  = tax1/0.08;
      double  price2  = tax2/0.1;
      Integer result  = (int)Math.floor(price1);
      
      if(price2*0.08==tax1) {
        result = (int)Math.floor(price2);
      }
      
      if(Math.floor(result*0.08)!=tax1 || Math.floor(result*0.1)!=tax2) {
        result = -1;
      }
      
      System.out.println(result);
      
    } catch (Exception e) {     
      System.out.print("error");
    }
  }
}