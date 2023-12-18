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
                int ok = -1; // 探索範囲先頭のインデックス
                int ng = n; // 探索範囲末尾のインデックス
                while (Math.abs(ok - ng) > 1) {
                        int mid = (ok + ng) / 2; // 中央要素のインデックス
                        if(a[mid] < key) ok = mid;
                        else ng = mid;
                }
                return ok;
        }
}
