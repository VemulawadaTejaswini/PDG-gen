import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        Integer M = sc.nextInt();
        List<Long> A = new ArrayList<>();
        Long total = 0L;
        for (int i=0;i<N;i++) {
            long a = sc.nextLong();
            A.add(a);
            total+=a;
        }
        Long _a = total / (4 * M);
        int count = 0;
        for (Long a : A) {
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
