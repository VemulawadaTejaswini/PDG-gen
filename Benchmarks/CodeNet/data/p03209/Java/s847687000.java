import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Long> bList = new ArrayList<>();
    static List<Long> pList = new ArrayList<>();
    static List<Long> nList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long X = scanner.nextLong();


        bList.add((long)0);
        pList.add((long)1);
        nList.add((long)1);
        for (int i = 1; i <= N; i++) {
            long b = bList.get(i-1);
            long p = pList.get(i-1);
            bList.add(2*b + 2);
            pList.add(2*p + 1);
            nList.add(2*b + 2 + 2*p + 1);
        }

        System.out.println(pSize(N, X));
    }

    static long pSize(int n, long x) {
        if (n == 0) {
            return 1;
        }
        if (x == 1 || x == n) {
            return 0;
        }

        long size = nList.get(n);
        if (size == x) {
            // 全部
            return pList.get(n);
        }
        if ((size+1)/2 == x) {
            // 真ん中
            return pList.get(n-1) + 1;
        }

        if ((size+1)/2 > x) {
            // 下
            return pSize(n-1, x-1);
        } else {
            // 上
            long p = pList.get(n-1) + 1;
            long s = nList.get(n-1);
            return p + pSize(n-1, x-s-2);
        }
    }

}
