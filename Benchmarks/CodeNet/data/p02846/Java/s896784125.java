import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long T1 = sc.nextLong();
    long T2 = sc.nextLong();
    long A1 = sc.nextLong();
    long A2 = sc.nextLong();
    long B1 = sc.nextLong();
    long B2 = sc.nextLong();
    long X = A1*T1+A2*T2;
    long Y = B1*T1+B2*T2;
    if(X == Y){
      System.out.println("infinity");
      return;
    }
    
    long D = X-Y;
    long E = Math.abs((A1-B1)*T1);
    double ans = Math.ceil((double)E/D);
    System.out.println((long)ans*2-1);
  }
}