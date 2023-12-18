import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        long np = B - A + 1;
        if (N == 1) {
            if (A != B) System.out.println(0);
            else System.out.println(np); // 1
            return;
        }
        if (A > B)  {
            System.out.println(0);
            return;
        }

        long ans = (N - 2) * (B - A) + 1;
        System.out.println(ans);


        return;
    }

}