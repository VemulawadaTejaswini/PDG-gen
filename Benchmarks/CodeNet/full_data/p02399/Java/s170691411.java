import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        long num1 = Integer.parseInt(lines[0]);
        long num2 = Integer.parseInt(lines[1]);

        long ans1 = num1 / num2;
        long ans2 = num1 % num2;
        BigDecimal value1 = BigDecimal.valueOf(num1);
        BigDecimal value2 = BigDecimal.valueOf(num2);
        BigDecimal ans3 = value1.divide(value2, 2, RoundingMode.HALF_UP);
        
        System.out.println(ans1 + " " + ans2 + " " + ans3);


    }
}