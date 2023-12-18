import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);

        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());

        Long ar = 0L;
        Long br = 0L;
        boolean a_result = true;

        Long count = 10L;
        while(true) {
            Integer tmp_b = (int) Math.floor(count * 0.1);
            if(tmp_b == b) {
                br = count;
                break;
            }
            count += 10;
        }

        if((int) Math.floor(count * 0.08) > a ) {
            System.out.println(-1);
            System.exit(0);
        }

        while(true){
            Integer tmp_a = (int) Math.floor(count * 0.08);
            if(tmp_a == a) {
                ar = count;
                break;
            }
            count++;

        }

        System.out.println(ar);
    }
}
