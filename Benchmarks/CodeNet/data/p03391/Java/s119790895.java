import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer> A = new ArrayList<>();
    static ArrayList<Integer> B = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Q = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < Q; i++) {
            A.add(scanner.nextInt());
            B.add(scanner.nextInt());
        }
        scanner.close();

        while (!A.isEmpty()) {
            // 要素チェック
            if (A.equals(B)) {
                System.out.println(count);
                return;
            }
            // A操作
            procA();

            // B操作
            procB();

            // count up
            count++;
        }

        System.out.println(count);
    }

    // A操作
    private static void procA() {
        int maxKey = 0;
        int max = -1;
        for (int i = 0; i < A.size(); i++) {
            int d = B.get(i) - A.get(i);
            if (d > 0 && d > max && A.get(i) != 0) {
                maxKey = i;
                max = d;
            }
        }
        if (max > -1) {
            A.set(maxKey, A.get(maxKey) - 1);
            return;
        }

        for (int i = 0; i < A.size(); i++) {
            int d = A.get(i) - B.get(i);
            if (d > max) {
                maxKey = i;
                max = d;
            }
        }
        if (max > -1) {
            A.set(maxKey, A.get(maxKey) - 1);
            if (A.get(maxKey) == B.get(maxKey)) {
                A.remove(maxKey);
                B.remove(maxKey);
            }
            return;
        }
    }

    // B操作
    private static void procB() {
        int minKey = 0;
        int min = 1000000001;
        for (int i = 0; i < B.size(); i++) {
            int d = B.get(i) - A.get(i);
            if (d > 0 && d < min && B.get(i) != 0) {
                minKey = i;
                min = d;
            }
        }
        if (min < 1000000001) {
            B.set(minKey, B.get(minKey) - 1);
            if (A.get(minKey) == B.get(minKey)) {
                A.remove(minKey);
                B.remove(minKey);
            }
        }
        return;
    }
}