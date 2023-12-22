import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    final int num = sc.nextInt();
    final List<Integer> a = new ArrayList<Integer>();
    final int mod = (int) Math.pow(10, 9) + 7;

    for (int i = 0; i < num; i++) {
      a.add(sc.nextInt());
    }

    int total = 0;
    for (int i = 0; i < a.size() - 1; i++) {
      for (int j = i + 1; j < a.size(); j++) {
        total = (total + (a.get(i) % mod) * (a.get(j) % mod)) % mod;
      }
    }

    System.out.println(total);
  }
}