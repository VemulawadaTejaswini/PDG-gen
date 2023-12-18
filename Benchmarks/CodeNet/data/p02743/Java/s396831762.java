import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    double n = scan.nextLong();
    double m = scan.nextLong();
    double k = scan.nextLong();
    double x = Math.sqrt(n);
    double y = Math.sqrt(m);
    double z = Math.sqrt(k);
    if((x + k) < z){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}