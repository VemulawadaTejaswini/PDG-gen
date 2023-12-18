import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] v = new int[N];
        for(int i = 0; i < N; i++) {
            v[i] = scanner.nextInt();
        }
        Arrays.sort(v);
        double prev = v[0];
        for(int i = 1; i < N; i++) {
            prev = (prev + v[i]) / 2;
        }
        System.out.println(prev);
    }
}
