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

        int ans = 0;
        for (int c : C) {
            for (int b : B) {
                if (b < c) {
                    for (int a : A) {
                        if (a < b && b < c) ans++;
                        else break;
                    }
                } else break;
            }
        }

        System.out.println(ans);
    }

}
