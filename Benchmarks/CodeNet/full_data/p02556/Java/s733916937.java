import java.util.Scanner;

//atcoderはScannerクラスのsc.next()で行ける
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans1;
        long ans2;
        int n = sc.nextInt();
        ArrayList<long[]> dists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long tmp = sc.nextLong();
            long tmp1 = sc.nextLong();
            dists.add(new long[]{tmp, tmp1});
        }

        long[] min = dists.get(0);
        long[] max = dists.get(0);
        for (long[] arr : dists) {
            if (min[0] * min[1] >= arr[0] * arr[1]) {
                min = arr;
            }
            if (max[0] * max[1] <= arr[0] * arr[1]) {
                max = arr;
            }
        }
        ans1 = zettaiti(min[0] - max[0]);
        ans2 = zettaiti(min[1] - max[1]);
        System.out.println(ans1 + ans2);
    }

    public static long zettaiti(long a) {
        return a >= 0 ? a : a * -1;
    }
}