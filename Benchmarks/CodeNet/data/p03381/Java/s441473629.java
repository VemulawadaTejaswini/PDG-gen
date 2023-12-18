import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Long> X = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            X.add(scanner.nextLong());
        }
        scanner.close();

        for (int i = 0; i < N; i++) {
            @SuppressWarnings("unchecked")
            ArrayList<Long> C = (ArrayList<Long>) X.clone();
            C.remove(i);
            Collections.sort(C);
            // Long[] A = C.toArray(new Long[N-1]);
            // Arrays.sort(A);
            // System.out.println(C);
            int l = C.size();
            int d = (l + 1) / 2;

            Long ans = C.get(d - 1);
            System.out.println(ans);
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}