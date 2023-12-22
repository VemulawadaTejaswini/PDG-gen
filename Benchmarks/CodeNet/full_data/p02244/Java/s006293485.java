import java.util.*;

public class Main {

    static char[][] map;

    static boolean next_permutation(int[] p) {
      for (int a = p.length - 2; a >= 0; --a)
        if (p[a] < p[a + 1])
          for (int b = p.length - 1;; --b)
            if (p[b] > p[a]) {
              int t = p[a];
              p[a] = p[b];
              p[b] = t;
              for (++a, b = p.length - 1; a < b; ++a, --b) {
                t = p[a];
                p[a] = p[b];
                p[b] = t;
              }
              return true;
            }
      return false;
    }

    static boolean search(int i, int j) {
        boolean flg = true;
        for (int r=0;r<8;r++){
            if (r==i) continue;
            if (map[r][j]=='Q') {
                flg = false;
            }
        }
        for (int c=0;c<8;c++) {
            if (c==j) continue;
            if (map[i][c]=='Q') {
                flg = false;
            }
        }
        for (int k=-Math.min(i, j);k<=Math.min(7-i, 7-j);k++) {
            if (k==0) continue;
            if (map[i+k][j+k]=='Q') {
                flg = false;
            }
        }
        for (int k=-Math.min(i, 7-j);k<=Math.min(7-i, j);k++) {
            if (k==0) continue;
            if (map[i+k][j-k]=='Q') {
                flg = false;
            }
        }
        return flg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] r = new int[k];
        int[] c = new int[k];
        for (int i=0;i<k;i++) {
            r[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int[] arr = new int[8];
        for (int i=0;i<8;i++) {
            arr[i] = i;
        }
        do {
            boolean flag = true;
            map = new char[8][8];
            for (int i=0;i<8;i++) {
                for (int j=0;j<8;j++) {
                    map[i][j] = '.';
                }
            }
            for (int i=0;i<k;i++) {
                map[r[i]][c[i]] = 'Q';
            }
            for (int i=0;i<8;i++) {
                map[i][arr[i]] = 'Q';
            }

            loop:for (int i=0;i<8;i++) {
                for (int j=0;j<8;j++) {
                    if (map[i][j]=='Q') {
                        if (!search(i, j)) {
                            flag = false;
                            break loop;
                        }
                    }
                }
            }

            if (flag) {
                for (int i=0;i<8;i++) {
                    for (int j=0;j<8;j++) {
                        if (j!=7) System.out.print(map[i][j]);
                        else System.out.println(map[i][j]);
                    }
                }
                break;
            }
        } while (next_permutation(arr));
    }
}
