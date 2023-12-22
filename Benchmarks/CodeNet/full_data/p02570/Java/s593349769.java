import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int T = sc.nextInt();
    int S = sc.nextInt();
    
    if( D<1 || D>10000 || T<1 || T>10000 || S<1 || S>10000) {
      System.out.println("out of bounds");
    }
    else if((D/S)<=T) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}