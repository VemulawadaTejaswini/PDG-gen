import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int total = 0;

        for(int i=1; i<=num; i++){
            if (i < a) continue;
            String line = String.valueOf(i);
            char[] charline = line.toCharArray();
            int sum = 0;
            for(char j: charline){
                String k = String.valueOf(j);
                int s = Integer.parseInt(k);
                sum += s;
            }
            if (sum >= a && sum <= b){
                total += i;
            }
        }

        System.out.println(total);
    }
}
