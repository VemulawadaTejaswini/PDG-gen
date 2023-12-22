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
        int K = sc.nextInt();

        int sum = 0;
        if (K - A >=0) {
            K -= A;
            sum += A;
        } else {
            System.out.println(K);
            return;
        }

        if (K - B >=0) {
            K -= B;
            sum += B*0;
        } else {
            System.out.println(sum);
            return;
        }

        System.out.println(sum - K);

        return;
    }

}