import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 3) {
            System.out.println(0);
            return;
        }

        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            int l = sc.nextInt();
            L[i] = l;
        }
        // ソート
        L = Arrays.stream(L).boxed()
            .sorted(Comparator.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int Li = L[i];
            for (int j = i + 1; j < N; j++) {
                int Lj = L[j];
                for (int k = j + 1; k < N; k++) {
                    int Lk = L[k];
                    if (Li >= Lj + Lk) {
                        break;
                    }
                    if (Lj >= Li + Lk) {
                        break;
                    }
                    if (Lk < Li + Lj) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
