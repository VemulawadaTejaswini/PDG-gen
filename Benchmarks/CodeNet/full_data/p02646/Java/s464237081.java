import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int V = sc.nextInt();
    int B = sc.nextInt();
    int W = sc.nextInt();
    int T = sc.nextInt();
    int a=B-A;
    if(a<=0){a=a*-1;}
    if((V-W)*T >= a || a == 0) {
      System.out.println("YES");
    }else(a<0) {
      System.out.println("NO");
    }
  }
}
