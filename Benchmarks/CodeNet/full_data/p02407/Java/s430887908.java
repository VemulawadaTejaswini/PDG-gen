import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            a.add(Integer.parseInt(sc.next()));
        }

        for (int i = a.size() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.printf("%d\n", a.get(i));
            } else {
                System.out.printf("%d ", a.get(i));
            }
        }
    }
}