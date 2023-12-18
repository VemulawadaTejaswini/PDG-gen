import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");
            String[] dList = sc.nextLine().split(" ");

            Arrays.sort(dList);

            long n = Long.valueOf(line[0]);
            long k = Long.valueOf(line[1]);

            long aCnt = n - k;

            if (aCnt <= 0) {
                System.out.println("0");
                return;
            }

            BigDecimal result = BigDecimal.ZERO;
            for (int i = 0; i < aCnt; i++) {
                result = result.add(new BigDecimal(dList[i]));
            }

            System.out.println(result.toPlainString());
        }
    }
}