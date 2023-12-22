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
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        int[] mina = Arrays.copyOf(A, A.length);
        int[] maxa = Arrays.copyOf(B, B.length);

        Arrays.sort(mina);
        Arrays.sort(maxa);

        if (N % 2 == 0) {
            int l = mina[N/2] + mina[N/2 - 1];;
            int r = maxa[N/2] + maxa[N/2 - 1];;
            System.out.println(r - l + 1);
        } else {
            //System.out.println("odd" + maxa[N/2]);
            System.out.println(maxa[N/2] - mina[N/2] + 1);
        }
        return;
    }

}