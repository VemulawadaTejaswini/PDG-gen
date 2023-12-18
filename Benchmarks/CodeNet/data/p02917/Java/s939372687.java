
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        for (int i = 0; i < N - 1; i++) {
            B.add(scanner.nextInt());
        }

        A.add(B.get(0));
        for (int i = 0; i < N-1; i++) {
          A.add(Math.max(A.get(i),B.get(i)));
        }

        int ans = A.stream().mapToInt(x->x).sum();
        System.out.println(ans);
    }
}
