import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt(), m = in.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a = in.nextInt(), b = in.nextInt();
            if (a == 1) {
                list1.add(b);
            }
            if (b == n) {
                list2.add(a);
            }
        }

        for (int i : list1) {
            for (int j : list2) {
                if (i == j) {
                    System.out.println("POSSIBLE");
                    return;
                }
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}