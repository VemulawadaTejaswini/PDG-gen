import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    String[] list = new String[26];
    char tmp = 'a';
    for (int i = 0; i < 26; i++) {
      list[i] = String.valueOf(tmp++);
    }

    String ans = "";
    while (n > 0) {
      n--;
      int mod = n % 26;
      if (mod < 0) {
        mod += 26;
      }
      ans += list[mod];
      n /= 26;
    }

    StringBuffer str = new StringBuffer(ans);
    String s = str.reverse().toString();
    System.out.println(s);
  }
}