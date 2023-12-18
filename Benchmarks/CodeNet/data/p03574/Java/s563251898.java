import java.util.*;

class Main {
  public static int isBomb(char c) {
    if (c == '#') {
      return 1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String S[] = new String[H];
    for (int i = 0; i < H; i++) {
      S[i] = sc.next();
    }
    char c[][] = new char[H][W];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (S[i].charAt(j) == '#') {
          System.out.print("#");
        } else {
          int bomb = 0;
          if (i != 0) {
            if (j != 0) bomb += isBomb(S[i-1].charAt(j-1));
            bomb += isBomb(S[i-1].charAt(j));
            if (j != W - 1) bomb += isBomb(S[i-1].charAt(j+1));
          }
          if (j != 0) bomb += isBomb(S[i].charAt(j-1));
          if (j != W - 1) bomb += isBomb(S[i].charAt(j+1));
          if (i != H - 1) {
            if (j != 0) bomb += isBomb(S[i+1].charAt(j-1));
            bomb += isBomb(S[i+1].charAt(j));
            if (j != W - 1) bomb += isBomb(S[i+1].charAt(j+1));
          }
          System.out.print(bomb);
        }
      }
      System.out.println();
    }
  }

}
