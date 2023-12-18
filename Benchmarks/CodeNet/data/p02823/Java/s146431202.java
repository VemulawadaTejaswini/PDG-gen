import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();

        long diff = Math.abs(A - B);

        if (diff % 2 == 0) {
            System.out.println(diff / 2);
        } else {
            long V = Math.max(A, B);
            System.out.println(V - 1);
        }
        
        return;
    }

}