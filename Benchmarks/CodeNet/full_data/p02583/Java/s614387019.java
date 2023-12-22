import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        for (int i = 0; i < N; i++) {
            int Li = sc.nextInt();
            ar[i] = Li;
        }
        long count = 0;
        for (int i = 0; i < N; i++) {
            int inow = ar[i];
            for (int j = i+1; j < N; j++) {
                int jnow = ar[j];
                if (inow == jnow) {
                    continue;
                }
                for (int k = j+1; k < N; k++) {
                    int know = ar[k];
                    if (inow == know || jnow == know) {
                        continue;
                    }
                    int max = Math.max(inow, Math.max(jnow, know));
                    int min = Math.min(inow, Math.min(jnow, know));
                    int mid = inow+jnow+know-max-min;
                    if (max < min+mid) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}