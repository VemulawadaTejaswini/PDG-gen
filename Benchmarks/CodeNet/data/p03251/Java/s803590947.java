import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            X.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            Y.add(sc.nextInt());
        }
        int xMax = Collections.max(X) + 1;
        int yMin = Collections.min(Y);
        if(!(xMax > x)) {
            System.out.println("War");
            return;
        }
        if(!(yMin <= y)) {
            System.out.println("War");
            return;
        }
        if(!(yMin - xMax >= 0)){
            System.out.println("War");
            return;
        }
        System.out.println("No War");
    }
}