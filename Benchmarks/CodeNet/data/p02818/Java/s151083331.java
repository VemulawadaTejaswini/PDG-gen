import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Long x = scanner.nextLong();
        Long y = scanner.nextLong();
        Long z = scanner.nextLong();

        Long rest_of_takahshi_cokie = x - z;
        Long rest_of_aoki_cokie = rest_of_takahshi_cokie + y;

        if(rest_of_takahshi_cokie > 0) {
            System.out.println(rest_of_takahshi_cokie + " " + y);
        } else {
            if (rest_of_aoki_cokie < 0) {
                System.out.println(0 + " " + 0);
            } else{
                System.out.println(0 + " " + rest_of_aoki_cokie);
            }
        }
    }
}