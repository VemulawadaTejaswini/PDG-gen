import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(0);
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        scanner.close();
        A.add(0);

        int d = 0;
        for (int i = 0; i + 1 < N + 2; i++) {
            d += Math.abs(A.get(i + 1) - A.get(i));
        }

        for (int i = 0; i < N; i++) {
            System.out.println(d - Math.abs(A.get(i + 2) - A.get(i + 1)) - Math.abs(A.get(i + 1) - A.get(i))
                    + Math.abs(A.get(i + 2) - A.get(i)));
        }
    }

}