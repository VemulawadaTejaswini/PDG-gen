import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        int enda;
        if (b >= a + k) {
            enda = a + k;
        } else {
            enda = b;
        }
        int startb;
        if (a >= b - k) {
            startb = a;
        } else {
            startb = b - k + 1;
        }

        for (int i = a; i < enda; i++) {
            set.add(i);
        }
        for (int i = startb; i <= b; i++) {
            set.add(i);
        }
        for (int i : set) {
            System.out.println(i);
        }
    }

}
