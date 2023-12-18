import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        scanner.close();

        for (int i = 1; i <= N; i++) {
            ArrayList<Integer> Ad = new ArrayList<>();
            Ad.add(0);
            Ad.addAll(A);
            Ad.remove(i);
            Ad.add(0);
            int count = 0;
            for (int j = 0; j < Ad.size() - 1; j++) {
                count += Math.abs(Ad.get(j + 1) - Ad.get(j));
            }
            System.out.println(count);
        }
    }
}
