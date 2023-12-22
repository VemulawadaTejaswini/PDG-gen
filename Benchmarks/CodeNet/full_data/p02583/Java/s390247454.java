import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int L[] = new int[N];
        int max = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            L[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        if (N > 2) {
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    for (int k = j + 1; k < N; k++) {
                        if (L[i] != L[j] && L[j] != L[k] && L[i] != L[k]) {
                            max = Math.max(L[i], Math.max(L[j], L[k]));
                            sum = L[i] + L[j] + L[k] - max;
                            if (max < sum) {
                                count++;
                                //System.out.println(L[i] + ":" + L[j] + ":" + L[k]);
                            }
                        }
                        max = 0;
                        sum = 0;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
