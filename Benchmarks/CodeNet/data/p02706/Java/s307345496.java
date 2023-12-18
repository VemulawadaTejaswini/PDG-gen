
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());

        Integer[] syukudai = new Integer[y];
        for(int i =0; i < y; i++) {
            syukudai[i] = Integer.parseInt(scanner.next());
        }

        int sum = Stream.of(syukudai).mapToInt(Integer::intValue).sum();
        if (x > sum) {
            System.out.println(x - sum);
        } else {
            System.out.println(-1);
        }

    }
}