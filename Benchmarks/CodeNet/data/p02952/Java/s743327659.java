import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {

    public static int calculate(String n, int sentou) {
        int total = 0;
        double pow;

        for(int i = n.length(); i > 1; i-=2) {
            pow = Math.pow(10, i - 1);
            int gensan = (int) pow * sentou;
            System.out.println(pow);
            System.out.println(gensan);
            int hasuu = (Integer.parseInt(n) - gensan) * sentou;
            
            System.out.println(hasuu);
            total += hasuu + sentou;
        }
        return total;
    }
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();


        int total = 0;
        if (n.length() == 1) {
            System.out.println(n);
            System.exit(0);
        } else if (n.length() % 2 == 0) {
            int sentou = Character.getNumericValue(n.charAt(0));
            total = calculate(n, 1);
        } else {
            int sentou = Character.getNumericValue(n.charAt(0));
            total = calculate(n, sentou);

        }

        System.out.println(total + 9);
    }
}