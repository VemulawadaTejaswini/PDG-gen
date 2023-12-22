import java.util.Scanner;
import java.util.HashSet;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = 0;
        int len = str.length();
        for (int i = 0; i < len-3; i++) {
          Long target = Long.parseLong(str.substring(i));
          while (target >= 2019) {
              if (target % 2019 == 0) {
                  num++;
              }
              target /= 10;
          }
        }
        System.out.println(num);
    }
}