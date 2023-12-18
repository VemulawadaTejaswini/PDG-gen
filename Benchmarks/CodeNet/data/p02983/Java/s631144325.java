import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        long l = Long.parseLong(s.split(" ")[0]);
        long r = Long.parseLong(s.split(" ")[1]);

        if(l / 2019 < r / 2019){
            System.out.println(0);
        } else {
            long a = l % 2019;
            long b = (l + 1) % 2019;
            System.out.println(a * b % 2019);

        }

        return;
    }
}
