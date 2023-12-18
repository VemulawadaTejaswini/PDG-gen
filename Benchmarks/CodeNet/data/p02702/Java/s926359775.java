import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int MOD = 2019;
    long answer = 0;
    String s = sc.next();

    int len = s.length();
    int[] powmods = new int[len];
    int[] modcnt = new int[MOD];
    powmods[0] = 1;
    for (int i = 1; i < len; i++) {
      powmods[i] = powmods[i - 1] * 10 % MOD;
    }
    int mod2019 = 0;
    modcnt[0]++;
    for (int i = 0; i < len; i++) {
      int num = (s.charAt(len - 1 - i) - '0') * powmods[i] % MOD;
      mod2019 = (mod2019 + num) % MOD;
      modcnt[mod2019]++;
    }
    for (int i = 0; i < MOD; i++) {
        if (modcnt[i] > 1) {
            answer += (modcnt[i] * (modcnt[i] - 1) / 2);
        }
    }
    System.out.println(answer);
  }
}