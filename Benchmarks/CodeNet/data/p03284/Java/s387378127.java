import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
           Scanner sc = new Scanner(System.in);
           int a,b,sum;
           a = sc.nextInt();
           b = sc.nextInt();
     
           int tmp = a % b;
           
          if(tmp == 0) {
             System.out.print(0); 
          } else {
             System.out.print(1);
          }
     
   }
}