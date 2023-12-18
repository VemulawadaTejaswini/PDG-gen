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
        int[] a = new int[3 * N];

        for (int i = 0; i < 3 * N; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        long sum = 0;
        for (int i = 3 * N - 1; i >= N; i -= 2) {
            sum += a[i - 1];
        }

        System.out.println(sum);
        
        return;
    }

}