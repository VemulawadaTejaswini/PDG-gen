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
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int cnt = 0;
        int cur = A[0];
        for (int i = 1, sign = 0; i < A.length; i++) {
            int diff = (A[i] - cur);
            if (diff * sign < 0) {
                cnt++;
                sign = 0;
            } else if (diff > 0) {
                sign = 1;
            } else if (diff < 0) {
                sign = -1;
            }
            cur = A[i];
        }

        System.out.println(cnt + 1);

        
        return;
    }

}