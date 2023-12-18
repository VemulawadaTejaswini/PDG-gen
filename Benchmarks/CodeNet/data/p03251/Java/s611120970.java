import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int xX = sc.nextInt();
        int yY = sc.nextInt();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            y.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(x);
        Collections.sort(y);

        int low = Math.max(xX, x.get(n - 1));
        int high = Math.min(yY, y.get(0));
        if (low < high) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }

    }

}
