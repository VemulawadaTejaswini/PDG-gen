import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        final String NUM_STR = s.next();

        int cnt = 0;
        for (int i = 0 ; i <= NUM_STR.length() ; i++) {
            for(int j = i + 1 ; j <= NUM_STR.length() ; j++) {
                try {
                    long num = Long.parseLong(NUM_STR.substring(i, j));
                    if (num % 2019 == 0) cnt += 1;
                } catch (NumberFormatException ne) {
                    // 桁数オーバー
                    break;
                }
            }
        }
        System.out.println(cnt);
  }
}