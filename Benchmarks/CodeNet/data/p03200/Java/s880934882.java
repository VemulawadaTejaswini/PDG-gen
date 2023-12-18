import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int[] numW = new int[s.length + 1];
    numW[s.length] = 0;
    for (int i = s.length - 1; i >= 0; i--) {
      numW[i] = numW[i + 1];
      if (s[i] == 'W') numW[i]++;
    }

    long sum = 0;
    for (int i = 0; i < s.length; i++) {
      if (s[i] == 'B') sum += numW[i];
    }
    System.out.println(sum);
  }
}
