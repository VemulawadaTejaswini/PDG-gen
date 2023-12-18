import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(sc.next());
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            int tmpCount = 0;
            for (int j = i; j < N - 1; j++) {
                if (H[j] >= H[j + 1]) {
                    tmpCount++;
                } else {
                    break;
                }
            }

            if (tmpCount > count) {
                count = tmpCount;
            }
        }

        System.out.println(count);
    }
}