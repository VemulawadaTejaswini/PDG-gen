import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    double x = Math.sqrt(scan.nextLong());
    double y = Math.sqrt(scan.nextLong());
    double z = Math.sqrt(scan.nextLong());
    if(x + y < z){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}