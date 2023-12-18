import java.util.Scanner;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] l = new int[n];
                for (int i = 0; i < n; i++) {
                        l[i] = sc.nextInt();
                }
                sc.close();
                int r = 0;
                Arrays.sort(l);
                for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                                int idx = binSearch(l, n, l[i] + l[j]);
                                r += idx - j;
                        }
                }
                System.out.println(r);
        }

        static int binSearch(int[] a, int n, int key) {
                int pl = 0; // 探索範囲先頭のインデックス
                int pr = n - 1; // 探索範囲末尾のインデックス
                int r = -1;
                do {
                        int pc = (pl + pr) / 2; // 中央要素のインデックス
                        if (a[pc] < key) {
                                r = pc;
                                pl = pc + 1; // 探索範囲を後半に絞り込む
                        } 
                        else pr = pc - 1; // 探索範囲を前半に絞り込む
                } while(pl <= pr);
                return r; // 探索結果
        }
}
