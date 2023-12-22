import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            p.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(p);

        long min = 0;
        for (int i = 0; i < K; i++) {
            min += p.get(i);
        }

        System.out.println(min);
    }
}