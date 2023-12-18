import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] L = new Integer[N];
        for (int i = 0; i < N; i++) {
            L[i] = scanner.nextInt();
        }
        long ans = 0;
        Arrays.sort(L, Collections.reverseOrder());
        for (int j = 0; j < N - 2; j++) {
            for (int i = j + 1; i < N - 1; i++) {
                if (L[j] >= L[i] + L[i+1]) {
                    break;
                }
                for(int k = i + 1; k < N; k++) {
                    if (L[j] < L[i] + L[k]) {
                        ans++;
                    }else{
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}