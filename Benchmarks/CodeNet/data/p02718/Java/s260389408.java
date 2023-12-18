import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        Integer M = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        Long total = 0L;
        for (int i=0;i<N;i++) {
            int a = sc.nextInt();
            A.add(a);
            total+=a;
        }
        Long _a = total / (4 * M);
        int count = 0;
        for (Integer a : A) {
            if (a >= _a) {
                count++;
            }
        }
        if (count >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
