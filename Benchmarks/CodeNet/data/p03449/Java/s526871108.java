import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> A2 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A1.add(scanner.nextInt());
        }
        for (int i = 0; i < N; i++) {
            A2.add(scanner.nextInt());
        }
        scanner.close();

        int max = 0;
        int count1 = 0;
        for (int i = 0; i < N; i++) {
            count1 += A1.get(i);
            int count2 = count1;
            for (int j = i; j < N; j++) {
                count2 += A2.get(j);
            }
            if (max < count2) {
                max = count2;
            }

        }

        System.out.println(max);
    }
}