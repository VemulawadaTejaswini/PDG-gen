import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        while (k <= n){
            if((n - k) % 4 == 0){
                System.out.println("Yes");
                return;
            }
            k += 7;
        }
        System.out.println("No");

    }





























}
