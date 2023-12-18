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
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }


        long[] SA = new long[N + 1];
        for (int i = 0; i < N; i++) {
            SA[i + 1] = A[i] + SA[i];
        }

        long mind = Integer.MAX_VALUE;
        for(int i = 1; i < N; i++) {
            long len1 = SA[i] - SA[0];
            long len2 = SA[N] - SA[i];
            mind = Math.min(mind, Math.abs(len1 - len2));
        }
        
        System.out.println(mind);
        return;
    }

}