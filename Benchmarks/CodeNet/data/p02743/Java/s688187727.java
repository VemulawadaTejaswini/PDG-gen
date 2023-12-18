import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    double x = Math.sqrt(scan.nextInt());
    double y = Math.sqrt(scan.nextInt());
    double z = Math.sqrt(scan.nextInt());
    if(x + y < z){
      System.out.println("Yes");
    }
    else if(x + y >= z){
      System.out.println("No");
    }
  }
}
