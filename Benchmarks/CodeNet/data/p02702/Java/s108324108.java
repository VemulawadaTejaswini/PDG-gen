import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int sum = 0;
        for(int i = 4; i < S.length(); i++) {
            for(int j = 0; i + j <= S.length(); j++) {
                BigDecimal big = new BigDecimal(S.substring(j, j + i));
                BigDecimal div = new BigDecimal(2019);
                big.remainder(div);
                if(big.compareTo(BigDecimal.ZERO)==0 ) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}