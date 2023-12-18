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

        long diff = Math.abs(A - B);

        if (diff % 2 == 0) {
            System.out.println(diff / 2);
        } else {
            long v1 = Math.min(Math.max(A, B) - 1, Math.max(N - A, N - B));
            long v2 = Math.min(Math.min(A, B) - 1 + 1 + diff / 2,
                               Math.min(N - A, N - B) + 1 + diff / 2);
            System.out.println(Math.min(v1, v2));
        }
        
        return;
    }

}