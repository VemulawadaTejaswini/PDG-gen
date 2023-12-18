import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int H = sc.nextInt();
        int S = sc.nextInt();
        int D = sc.nextInt();

        int N = sc.nextInt();

        long ans = 0;
        long Q1 = 4*Q;
        long H1 = 2*H;
        long S1 = 1*S;
        long min1 = Math.min(Math.min(Q1, H1), S1);
        // 2l price
        if (N >= 2) {
            long min2 = Math.min(min1 * 2, D); 
            ans = (N/2) * min2;
            N %= 2;
        }   

        if (N == 1) {
            ans += min1;
        }   

        System.out.println(ans);
    
        return;
    }   

}
