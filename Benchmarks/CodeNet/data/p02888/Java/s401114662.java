import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;

        for (int i = 0; i < N; i++)
            L.add(sc.nextInt());

        L.sort(Comparator.naturalOrder());

        for (int i = 0; i < L.size() - 2; i++) {
            for (int j = i + 1; j < L.size() - 1; j++) {
                for (int k = j + 1; k < L.size(); k++) {
                    if (L.get(k) < L.get(i) + L.get(j)) {
                        count++;
                    }
                }
            }
        }


        System.out.println(count);

    }
}
