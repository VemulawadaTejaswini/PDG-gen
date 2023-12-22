import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        for (Scanner s = new Scanner(System.in); (n = s.nextInt()) > 0;) {
            int m = s.nextInt();
            boolean f=true;
            for (int i = n; i <= m; i++) {
                if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) {
                    System.out.println(i);
                    f=false;
                }
            }
            if(f) {
                System.out.println("NA");
            }
        }
    }
}
