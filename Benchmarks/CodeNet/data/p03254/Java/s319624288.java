import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        int[] a = new int[N];
        long sum = 0; // a[i] は 1≤ai≤109で、summation すると overflow するので注意
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        // ぴったり配れる場合は例外処理。
        if (x == sum) {
            System.out.println(N);
            return;
        }

        Arrays.sort(a);
        int cnt = 0;
        sum = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] + sum > x) {
                break;
            }
            sum += a[i];
            cnt++;
        }

        // N 人に配れるが、N人目にぴったり配るのに失敗してしまった場合。
        if (cnt == N) System.out.println(N - 1);
        else System.out.println(cnt);

        return;
    }

}