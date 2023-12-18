import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    ArrayList<Integer> A = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      A.add(scn.nextInt());
    }

    System.out.println(gcd(A));

  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }

  public static int gcd(ArrayList<Integer> a) {
    int ans = a.get(0);
    for (int i = 1; i < a.size(); i++) {
      ans = gcd(ans, a.get(i));
    }

    return ans;
  }

}
