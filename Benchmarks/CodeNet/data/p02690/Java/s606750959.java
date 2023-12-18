import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        BigDecimal X = BigDecimal.valueOf(x);
        for (int a = -200; a <= 200; a++) {
            BigDecimal A = BigDecimal.valueOf(a);
            BigDecimal A5 = A.pow(5);

            for (int b = -200; b <= 200; b++) {
                BigDecimal B = BigDecimal.valueOf(b);
                BigDecimal B5 = B.pow(5);
                
                if(A5.subtract(B5).equals(X)) {
                    System.out.println(String.format("%d %d\n", a, b));
                    return;
                }
            }
        }
    }
}
