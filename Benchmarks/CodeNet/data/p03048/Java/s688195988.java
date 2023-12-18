import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i * R <= N; i++) {
            for (int j = 0 ; i * R + j * B <= N; j++) {
                int k = N - i * R - j * B;
                if (k % G == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

        return;
    }

}