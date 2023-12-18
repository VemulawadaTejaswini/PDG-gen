import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
          for (int j = i + 1; j <= len; j++) {
              long target = Long.parseLong(str.substring(i, j));
              if (target % 2019 == 0) {
                  num++;
              }
          }
        }
        System.out.println(num);
    }
}