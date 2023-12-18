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

        int cnt = 0;
        for (int cur = 1; cur < B;) {
            cur = (cur - 1) + A;
            cnt++;
        }

        System.out.println(cnt);
        return;
    }

}