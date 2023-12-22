import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(run());
    }

    private static ArrayList<Integer> nScan(Scanner sc, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        return al;
    }

    private static Object run() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = nScan(sc,5);
        sc.close();

        for (int i = 0; i < 5; i++) {
            if (x.get(i) == 0) return i + 1;
        }
        return 0;
    }
}