import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    long max = 1000000000000000000L;
    long ans = 1;
    boolean of = false;
    for(int i=0; i<N; i++) {
      long A = sc.nextLong();
      if(A==0) {
        ans = 0;
        of = false;
        break;
      }
        long Amax = max/ans;
        if(A>Amax) {
          of = true;
        } else {
          ans *= A;
        }
      }
    System.out.println(of? -1 : ans);

    sc.close();
  }
}
