import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int V = sc.nextInt();
    int B = sc.nextInt();
    int W = sc.nextInt();
    int T = sc.nextInt();
    if((V-W)*T >= B=A) {
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
  }
}