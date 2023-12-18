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

        Boolean down = null;
        boolean equa = false;
        long cur = Long.MIN_VALUE;

        int cnt = 0;
        cur = A[0];
        for (int i = 1; i < A.length; i++) {
            if (cur == A[i]) {
                equa = true;
                cur = A[i];
                continue;
            } else  {
                equa = false;
            }
                
            if (cur > A[i]) {
                if (down != null && !down) {
                    cnt++;
                    down = null;
                } else {
                    down = true;
                }
            } else {
                if (down != null && down) {
                    cnt++;
                    down = null;
                } else {
                    down = false;
                }
            }
            cur = A[i];
        }

        System.out.println(cnt + 1);

        
        return;
    }

}