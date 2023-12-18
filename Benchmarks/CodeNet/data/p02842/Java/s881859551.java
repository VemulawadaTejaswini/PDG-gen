import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        BigDecimal decimal = new BigDecimal(input);
        BigDecimal res = decimal.multiply(new BigDecimal(100)).divideToIntegralValue(new BigDecimal(108));
        int v = res.intValue();
        while (true){
            int rest = (int)(v * 1.08);
            if (rest < input){
                v += 1;
            } else if (rest == input){
                System.out.println(v);
                break;
            } else if (rest > input){
                System.out.println(":(");
                break;
            }
        }
    }
}