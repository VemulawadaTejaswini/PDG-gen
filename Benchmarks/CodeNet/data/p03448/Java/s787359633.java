import java.util.Scanner;
import java.lang.*;

public class Main {
  public static int count = 0;

  public static void counter(int fh, int hd, int ft, int goal) {
    int maxFH = Math.min(goal / 500, fh);
    for (int i = 0; i <= maxFH; i++) {
        int postFH = goal - i * 500;
        int maxHD = 0;
        if (postFH > 0) {
            maxHD = Math.min(postFH / 100, hd);
        }
        for (int j = 0; j <= maxHD; j++) {
            int postHD = postFH - j * 100;
            int maxFT = 0;
            if (postHD > 0) {
                maxFT = Math.min(postHD / 50, ft);
            }
            for (int k = 0; k <= maxFT; k++) {
                int remainder = postHD - k * 50;
                if (remainder == 0) count++;
            }
        }
    }
  }

  public static void main(String[] args) {
    Scanner dataScanner = new Scanner(System.in);
    int fiveHundred = Integer.parseInt(dataScanner.nextLine());
    int hundred = Integer.parseInt(dataScanner.nextLine());
    int fifty = Integer.parseInt(dataScanner.nextLine());
    int goal = Integer.parseInt(dataScanner.nextLine());
    counter(fiveHundred, hundred, fifty, goal);
    System.out.println(count);
  }
}
