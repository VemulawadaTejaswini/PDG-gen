import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
	int pre = sc.nextInt();
    int total += pre;
    for (int i = 0; i < N-2; i++) {
      int cur = sc.nextInt();
      total += Math.max(pre, cur);
      pre = cur;
    }
    total += Math.max(pre, 0);
    System.out.println(total);
  }
}