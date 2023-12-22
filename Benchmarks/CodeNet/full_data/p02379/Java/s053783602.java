import java.math.BigDecimal;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 =  scan.nextDouble();
        double result = Math.sqrt(((x - x2) *(x - x2)) + ((y - y2) * (y - y2)));
        if(BigDecimal.valueOf(result).scale() > 8) {
            System.out.printf("%.8f", result);
        }
        else{
            System.out.print(result);
        }
        System.out.println();
    }
}
