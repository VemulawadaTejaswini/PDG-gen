import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
    int b = sc.nextInt();  // input Integer
    int c = sc.nextInt();  // input Integer
    
    double x=(double) a / c;
    if ( b>= x){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

//    String a = sc.next();  // input String
  }
}