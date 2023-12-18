import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        long left = t[0];
        long right = a[0];
        for (int i = 1; i < n; i++) {
            long hidari = t[i];
            long migi = a[i];
            if (left <= hidari && right <= migi) {
                left = hidari;
                right = migi;
            } else {
                long cnt = 1;
                while (true) {
                    if (left <= hidari * cnt && right <= migi * cnt) {
                        left = hidari * cnt;
                        right = migi * cnt;
                        break;
                    } else {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(left + right);
        sc.close();
    }
}