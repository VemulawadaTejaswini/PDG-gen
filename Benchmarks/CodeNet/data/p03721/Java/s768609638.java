import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            for (int i1 = 0; i1 < b; i1++) {
                list.add(a);
            }
        }

        Collections.sort(list);
        System.out.println(list.get(K-1));
    }
}