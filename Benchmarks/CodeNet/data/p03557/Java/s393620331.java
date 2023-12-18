import java.util.*;

public class Main {
    static int n;
    static int[] a;
    static int[] b;
    static int[] c;
    static int[] dpB;
    static int[] dpA;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        c = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        //a[]の中でb[i]の値よりも小さいのが何個あるか
        //c[]の中でb[i]の値よりも大きいのが何個あるか
        //２分探索
        long countA = 0;
        long countB = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            countA = binarySearch(b[i] - 0.1, a);
            if (countA < 0) continue;
            countB = n - binarySearch(b[i] + 0.1, c);
            if (countB < 0) continue;
            ans += countA * countB;
        }
        System.out.println(ans);
    }
    //２分探索
    static int binarySearch (double key, int[] array) {
        int left = -1;
        int right = array.length;
        while (right - left > 1) {
            int mid = (left + right)/2;
            if (array[mid] >= key) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}

