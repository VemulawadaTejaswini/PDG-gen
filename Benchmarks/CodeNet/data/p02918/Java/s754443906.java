import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    scan.nextLine();
    String S = scan.nextLine();

    int countLH = 0;
    int countRH = 0;
    char[] chars = S.toCharArray();
    char tmp1 = '\0';
    for (char s : chars) {
      if (s == 'L') {
        if (tmp1 == s) {
          countLH++;
        }
      } else {
        // R
        if (tmp1 == s) {
          countRH++;
        }
      }
      tmp1 = s;
    }

    boolean isLMany = countLH > countRH;
    char changeTo = isLMany ? 'L' : 'R';
    char target = isLMany ? 'R' : 'L';
    int mannaka = N / 2 + 1;

    for (int i = 1; i <= S.length(); i++) {
      if (chars[mannaka - 1] == target) {
        chars[mannaka - 1] = changeTo;
        if (--K <= 0) {
          break;
        }
      }
      if (i % 2 == 0) {
        mannaka += i;
      } else {
        mannaka -= i;

      }
    }
    char tmp = chars[0];
    int count = 0;
    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == tmp) {
        count++;
        continue;
      }
      tmp = chars[i];
    }
    System.out.println(count);
  }

}
