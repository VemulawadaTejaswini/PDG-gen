import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] H = new int[N];
        for(int i = 0; i < N; i++) {
            H[i] = scanner.nextInt();
        }
        if(N == 1) {
            System.out.println(0);
            return;
        }
        int max = 0;
        int count = 0;
        for(int i = 1; i < N; i++) {
            if(H[i-1] >= H[i]) {
                count++;
                max = Math.max(count, max);
            }else{
                count = 0;
            }
        }

        System.out.println(max);
    }
}