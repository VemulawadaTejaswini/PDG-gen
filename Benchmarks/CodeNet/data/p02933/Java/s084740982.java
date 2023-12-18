import java.util.Arrays;
import java.util.Scanner;

public class osero {

  static String[] s = new String[10];

  static StringBuilder[] sb = new StringBuilder[10];

  static int o_cnt;

  static int x_cnt;

  static int turn;

  static boolean goFlag;

  static boolean cannotputFlag;

  static boolean endFlag;

  static int cpu_x;

  static int cpu_y;

  static int mode;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    start();
    while (mode != 1 && mode != 2) {
      mode = decideMode(sc.nextInt());
    }
    checkBoard(0);
    displayBoard();
    count();
    announce(0);

    if (mode == 1) {
      out: while (true) {

        if (turn == 0) {
          while (!goFlag) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            changeBoard(x, y);
          }
        } else {
          cpuTurn();
          changeBoard(cpu_x, cpu_y);
        }

        checkBoard(turn);
        displayBoard();
        count();
        if (endFlag) {
          break out;
        }
        announce(turn);
      }

    } else if (mode == 2) {
      out: while (true) {

        while (!goFlag) {
          int x = sc.nextInt();
          int y = sc.nextInt();
          changeBoard(x, y);
        }

        cpuTurn();
        changeBoard(cpu_x, cpu_y);

        checkBoard(turn);
        displayBoard();
        count();
        if (endFlag) {
          break out;
        }
        announce(turn);
      }

    }
    sc.close();
    end();
  }

  public static void start() {
    Arrays.fill(s, "＊＿＿＿＿＿＿＿＿＊");

    sb[0] = new StringBuilder("＊＊＊＊＊＊＊＊＊＊");
    sb[9] = new StringBuilder("＊＊＊＊＊＊＊＊＊＊");
    for (int i = 0; i < 10; i++) {
      if (i != 0 && i != 9) {
        sb[i] = new StringBuilder(s[i]);
        if (i == 4) {
          sb[i].replace(4, 6, "＆％");
        } else if (i == 5) {
          sb[i].replace(4, 6, "％＆");
        }
      }

    }
    System.out.println("モードを数字で選択してください。1：CPU戦 2:対人戦");
  }

  public static int decideMode(int a) {

    if (a != 1 && a != 2) {
      System.out.println("モードは1か2の数字で選択してください");
    }
    return a;
  }

  public static void count() {
    o_cnt = 0;
    x_cnt = 0;
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 8; j++) {
        if (sb[i].substring(j, j + 1).equals("＆")) {
          o_cnt++;
        } else if (sb[i].substring(j, j + 1).equals("％")) {
          x_cnt++;
        }
      }
    }

    System.out.println("＆は" + o_cnt + "個、％は" + x_cnt + "個です");
    System.out.println();
  }

  public static void displayBoard() {
    endFlag = false;
    goFlag = false;

    System.out.println("　　 　　" + "１ ２ ３ ４ ５ ６ ７ ８");
    for (int i = 0; i < 10; i++) {
      if (i >= 1 && i <= 8) {
        System.out.print(i);
      } else {
        System.out.print("　");
      }
      System.out.println("　" + sb[i]);
    }

  }

  public static void changeBoard(int x, int y) {
    goFlag = false;
    int[] yoko = { -1, 0, 1, -1, 1, -1, 0, 1 };
    int[] tate = { -1, -1, -1, 0, 0, 1, 1, 1 };
    if (x < 1 || x > 8 || y < 1 || y > 8) {
      System.out.println("ヨコ、タテは1~8の整数で指定してください");
    }
    if (!sb[y].substring(x, x + 1).equals("＃")) {
      System.out.println("そこには置けません");
    } else {
      goFlag = true;

      if (turn == 0) {

        loop: for (int k = 0; k < 8; k++) {
          int m = x, n = y;
          m += yoko[k];
          n += tate[k];

          if (sb[n].substring(m, m + 1).equals("％")) {
            while (true) {
              m += yoko[k];
              n += tate[k];
              if (sb[n].substring(m, m + 1).equals("＆")) {
                while (!sb[n].substring(m, m + 1).equals("＃")) {
                  m -= yoko[k];
                  n -= tate[k];
                  if (sb[n].substring(m, m + 1).equals("＃")) {
                    continue loop;
                  } else {
                    sb[n].replace(m, m + 1, "＆");
                  }
                }
              } else if (sb[n].substring(m, m + 1).equals("％")) {
                continue;

              } else {
                continue loop;
              }
            }
          }
        }
        sb[y].replace(x, x + 1, "＆");
        turn = 1;
      } else {

        loop: for (int k = 0; k < 8; k++) {
          int m = x, n = y;
          m += yoko[k];
          n += tate[k];

          if (sb[n].substring(m, m + 1).equals("＆")) {
            while (true) {
              m += yoko[k];
              n += tate[k];
              if (sb[n].substring(m, m + 1).equals("％")) {
                while (!sb[n].substring(m, m + 1).equals("＃")) {
                  m -= yoko[k];
                  n -= tate[k];
                  if (sb[n].substring(m, m + 1).equals("＃")) {
                    continue loop;
                  } else {
                    sb[n].replace(m, m + 1, "％");
                  }
                }
              } else if (sb[n].substring(m, m + 1).equals("＆")) {
                continue;

              } else {
                continue loop;
              }
            }
          }
        }
        sb[y].replace(x, x + 1, "％");
        turn = 0;
      }
    }

  }

  public static void checkBoard(int turn) {

    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 8; j++) {
        if (sb[i].substring(j, j + 1).equals("＃")) {
          sb[i].replace(j, j + 1, "＿");
        }
      }
    }

    int[] yoko = { -1, 0, 1, -1, 1, -1, 0, 1 };
    int[] tate = { -1, -1, -1, 0, 0, 1, 1, 1 };

    cannotputFlag = true;
    if (turn == 0) {
      for (int i = 1; i <= 8; i++) {
        for (int j = 1; j <= 8; j++) {
          if (sb[i].substring(j, j + 1).equals("＆")) {
            loop: for (int k = 0; k < 8; k++) {
              int x = j + yoko[k];
              int y = i + tate[k];

              if (sb[y].substring(x, x + 1).equals("％")) {
                while (true) {
                  x += yoko[k];
                  y += tate[k];
                  if (sb[y].substring(x, x + 1).equals("＿")) {
                    sb[y].replace(x, x + 1, "＃");
                    cannotputFlag = false;
                    continue loop;
                  } else if (sb[y].substring(x, x + 1).equals("％")) {
                    continue;
                  } else {
                    continue loop;
                  }
                }
              }
            }
          }
        }
      }
    } else {
      for (int i = 1; i <= 8; i++) {
        for (int j = 1; j <= 8; j++) {
          if (sb[i].substring(j, j + 1).equals("％")) {
            loop: for (int k = 0; k < 8; k++) {
              int x = j + yoko[k];
              int y = i + tate[k];

              if (sb[y].substring(x, x + 1).equals("＆")) {
                while (true) {
                  x += yoko[k];
                  y += tate[k];
                  if (sb[y].substring(x, x + 1).equals("＿")) {
                    sb[y].replace(x, x + 1, "＃");
                    cannotputFlag = false;
                    continue loop;
                  } else if (sb[y].substring(x, x + 1).equals("＆")) {
                    continue;
                  } else {
                    continue loop;
                  }
                }
              }
            }
          }
        }
      }
    }

    if (cannotputFlag) {
      System.out.println("置ける場所がありません。手番をパスします");
      if (!endFlag) {
        endFlag = true;
        turn = ~turn;
        checkBoard(turn);
      }
    }

  }

  public static void announce(int turn) {

    if (turn == 0) {
      System.out.println("先攻の番です");
    } else {
      System.out.println("後攻の番です");
    }

    System.out.println("置く場所をヨコ、タテの順に指定してください");
  }

  public static void end() {
    System.out.println("対戦終了です");
    if (o_cnt > x_cnt) {
      System.out.println("先攻の勝ちです");
    } else if (o_cnt < x_cnt) {
      System.out.println("後攻の勝ちです");
    } else {
      System.out.println("引き分けです");
    }
    System.exit(0);
  }

  public static void cpuTurn() {
    int[] yoko = { -1, 0, 1, -1, 1, -1, 0, 1 };
    int[] tate = { -1, -1, -1, 0, 0, 1, 1, 1 };
    int minFlipCnt = 64;
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 8; j++) {
        if (sb[i].substring(j, j + 1).equals("＃")) {
          int cnt = 0;
          loop: for (int k = 0; k < 8; k++) {
            int m = j, n = i;
            m += yoko[k];
            n += tate[k];

            if (sb[n].substring(m, m + 1).equals("＆")) {
              while (true) {
                m += yoko[k];
                n += tate[k];
                if (sb[n].substring(m, m + 1).equals("％")) {
                  while (!sb[n].substring(m, m + 1).equals("＃")) {
                    m -= yoko[k];
                    n -= tate[k];
                    if (sb[n].substring(m, m + 1).equals("＃")) {
                      continue loop;
                    } else {
                      cnt++;
                    }
                  }
                } else if (sb[n].substring(m, m + 1).equals("＆")) {
                  continue;

                } else {
                  continue loop;
                }
              }
            }
          }
          cnt++;
          if (cnt < minFlipCnt) {
            minFlipCnt = cnt;
            cpu_x = j;
            cpu_y = i;
          }
        }

      }
    }
  }
}
