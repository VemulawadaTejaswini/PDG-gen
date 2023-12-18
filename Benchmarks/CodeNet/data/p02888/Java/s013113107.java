import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                int idxAB = Arrays.binarySearch(a, a[i] + a[j]);
                if (idxAB < 0) {
                    count += -idxAB - 2 - j;
                } else {
                    count += idxAB - 1 - j;
                    for (int k = 1; k < a.length - 2; k++) {
                        if (a[idxAB] == a[idxAB + 1]) {
                            count++;
                        } else {
                            break;
                        }

                    }
                }
            }
        }
        System.out.println(count);
    }
}