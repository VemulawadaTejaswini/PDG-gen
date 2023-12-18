import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private long calc(long h, long area) {
        if (h % 2 == 0) return 0;
        else return area;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        long min = Long.MAX_VALUE;
        min = Math.min(calc(A, B * C), min);
        min = Math.min(calc(B, C * A), min);
        min = Math.min(calc(C, A * B), min);
        System.out.println(min);

        return;
    }

}