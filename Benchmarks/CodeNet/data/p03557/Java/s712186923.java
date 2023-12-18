import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();

        for (int i = 0; i < N; i++)
            A.add(sc.nextInt());
        Collections.sort(A);

        for (int i = 0; i < N; i++)
            B.add(sc.nextInt());
        Collections.sort(B);

        for (int i = 0; i < N; i++)
            C.add(sc.nextInt());
        Collections.sort(C);

        long[] up = new long[N];
        long[] dn = new long[N];

        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--) {
                if (A.get(j) < B.get(i)) {
                    up[i] = (long)j + 1; // record how many a is less at B[i];
                    break;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (C.get(j) > B.get(i)) {
                    dn[i] = (long) N - j;
                    break;
                }
            }
        }

        long res = 0;

        for (int i = 0; i < N; i++) {
            res += up[i] * dn[i];
        }

        System.out.println(res);
    }




}
