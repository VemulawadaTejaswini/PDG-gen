import java.util.*;

public class Main {

  public static final long mod = (long)1e9+7;

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());
    String A_txt = sc.nextLine();
    String[] arrA = A_txt.split(" ");

    long ans = 0;
    boolean isOdd = ((N - 1) % 2 == 1);
    int[] count = new int[N];

    for (String A: arrA) {
      int intA = Integer.parseInt(A);
      boolean isAOdd = (intA % 2 == 1);
      if (isOdd && !isAOdd) {
        System.out.println(ans);
        return;
      }

      if (!isOdd && isAOdd) {
        System.out.println(ans);
        return;
      }

      count[intA]++;
      if (count[intA] > 2 || count[0] > 1) {
        System.out.println(ans);
        return;
      }
    }

    ans = (long)Math.pow(2, Math.floor(N/2));
    ans %= mod;
    System.out.println(ans);
  }
}