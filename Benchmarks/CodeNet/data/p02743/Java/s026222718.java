import java.util.*;

public class Panaso3{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    long x = scan.nextInt();
    long y = scan.nextInt();
    long z = scan.nextInt();

    double rx = Math.sqrt(x);
    double ry = Math.sqrt(y);
    double rz = Math.sqrt(z);
    
    if(rx + ry <= rz){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
