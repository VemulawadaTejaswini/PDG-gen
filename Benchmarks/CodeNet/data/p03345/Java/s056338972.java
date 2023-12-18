import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long K = sc.nextLong();

        long diff = A - B;

        if (diff > 1000000000000000000L) {
            System.out.println("Unfair");
        } else {
            System.out.println(diff);
        }

        return;
    }

}