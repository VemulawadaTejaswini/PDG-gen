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
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            a[i]--;
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (i == a[a[i]]) cnt++;
        }

        System.out.println(cnt / 2);

        return;
    }

}