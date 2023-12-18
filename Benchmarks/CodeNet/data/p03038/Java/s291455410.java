import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        Arrays.sort(A);

        BC[] bc = new BC[M];
        for (int i = 0; i < M; i++) {
            bc[i] = new BC(scanner.nextInt(), scanner.nextLong());
        }
        long[] D = new long[N];
        Arrays.sort(bc);
        reverse(bc);
        int idx = 0;
        outer: for (int i = 0; i < M; i++) {
            for (int j = 0; j < bc[i].B; j++) {
                if (idx == N) {
                    break outer;
                }
                D[idx++] = bc[i].C;
            }
        }
        Arrays.sort(D);
        reverse(D);

        for (int x = 0; x < N; x++) {
            if (A[x] < D[x]) {
                A[x] = D[x];
            }
        }
        long ans = 0;
        for (long a : A) {
            ans += a;
        }

        System.out.println(ans);

    }

    public static void reverse(BC[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            BC tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    public static void reverse(long[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            long tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    static class BC implements Comparable<BC> {
        int B;
        long C;

        public BC(int b, long c) {
            this.B = b;
            this.C = c;
        }

        @Override
        public int compareTo(BC o) {

            return Long.compare(this.C, o.C);
        }

    }
}
