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

        for (int i = 1; i <= 10000; i++) {
            if ((i / 10) == B && (i * 8 / 100) == A) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
        return;
    }

}