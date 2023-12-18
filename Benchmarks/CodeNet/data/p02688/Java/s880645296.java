import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                list.add(sc.nextInt());
            }
        }

        int count = 0;
        for (int k = 1; k <= N; k++) {
            if(!list.contains(k)) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}