import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int V = sc.nextInt();
    int B = sc.nextInt();
    int W = sc.nextInt();
    int T = sc.nextInt();
    int a=(V-W)*T;
    int b=B-A;
    if((V-W)*T >= B-A) {
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }