import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int K = scanner.nextInt();
    char[][] S = new char[H][W];
    for (int i = 0; i < H; i++) {
      S[i] = scanner.next().toCharArray();
    }

    int min = 1_000_000;
    for (int i = 0; i < 1 << (H - 1); i++) {
      int hcount = Integer.bitCount(i);
      int wcount = 0;
      int[] sum = new int[H];
      for (int j = 0; j < W; j++) {
        int[] next = new int[H];
        int ih = 0;
        for (int k = 0; k < H; k++) {
          if (S[k][j] == '1') next[ih]++;
          if ((i >> k & 1) == 1) ih++;
        }
        for (int k = 0; k < H; k++) if (next[k] > K) wcount = 1_000_000;
        for (int k = 0; k < H; k++) {
          if (sum[k] + next[k] > K) {
            wcount++;
            System.arraycopy(next, 0, sum, 0, H);
            break;
          } else {
            sum[k] += next[k];
          }
        }
      }
      min = Math.min(min, hcount + wcount);
    }
    System.out.println(min);
  }
}
