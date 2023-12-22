import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        List<Integer> l = new ArrayList<>();
        boolean f=false;
        for (Scanner s = new Scanner(System.in); (n = s.nextInt()) > 0;) {
            int m = s.nextInt();
            for (int i = n; i <= m; i++) {
                if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) {
                    l.add(i);
                }
            }
            if(f) {
                System.out.println();
            }
            f=true;
            if (l.isEmpty()) {
                System.out.println("NA");
            } else {
                for (int i : l) {
                    System.out.println(i);
                }
            }
        }
    }
}
