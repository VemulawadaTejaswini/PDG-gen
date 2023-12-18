import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    long x = scan.nextInt();
    long y = scan.nextInt();
    long z = scan.nextInt();

    double rx = Math.sqrt(x*y);
    
    if(x + y + 2*rx< z){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
