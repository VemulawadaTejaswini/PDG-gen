import java.util.Scanner;

public class Main {
  final static char WHITE = '.';
  final static char BLACK = '#';

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      char[] S = in.next().toCharArray();

      int[] blackBefore = new int[N];
      blackBefore[0] = 0;
      for (int i = 1; i < blackBefore.length; ++i) {
        blackBefore[i] = blackBefore[i - 1] + (S[i - 1] == BLACK ? 1 : 0);
      }

      int[] whiteAfter = new int[N];
      whiteAfter[whiteAfter.length - 1] = 0;
      for (int i = whiteAfter.length - 2; i >= 0; --i) {
        whiteAfter[i] = whiteAfter[i + 1] + (S[i + 1] == WHITE ? 1 : 0);
      }
      
      int minChange = Integer.MAX_VALUE;
      for (int i = 0; i < blackBefore.length; ++i) {
        minChange = Math.min(minChange, blackBefore[i] + whiteAfter[i]);
      }

      System.out.println(minChange);
    }
  }
}