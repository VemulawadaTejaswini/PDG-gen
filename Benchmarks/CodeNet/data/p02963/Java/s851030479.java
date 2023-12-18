import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong();
    System.out.print("0 0 ");
    long A = N/109;
    long B = A%109;
    System.out.println("109 1 "+B+" "+A);
  }
}