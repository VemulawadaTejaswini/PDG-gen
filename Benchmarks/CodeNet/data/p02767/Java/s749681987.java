
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());

        Integer[] b = new Integer[a];
        for(int i = 0; i < a; i++) {
            b[i] = Integer.parseInt(scanner.next());
        }

        double sum = Stream.of(b).mapToInt(Integer::intValue).sum();
        sum = Math.round(sum/a);

        Long total  = 0L;
        for(int i = 0; i < b.length; i++) {
            total += (b[i] - (long)sum) * (b[i] - (long)sum);
        }

        System.out.println(total);
    }
}
