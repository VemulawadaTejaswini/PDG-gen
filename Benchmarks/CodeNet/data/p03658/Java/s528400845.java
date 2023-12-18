import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    sc.nextLine();
    String l = sc.nextLine();
    String[] al = l.split(" ");
    int[] in = new int[n];
    for (int i = 0; i < n; i++) {
      in[i] = Integer.parseInt(al[i]);
    }
    Arrays.sort(in);
    int ans = 0;
    for (int i = n - 1; i >= n-k; i--) {
      ans += in[i];
    }
    System.out.println(ans);
  }
}