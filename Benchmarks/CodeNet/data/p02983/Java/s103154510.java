import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        boolean b = r-l>=2019;
        l %= 2019;
        r %= 2019;
        if (l>r||b) {
            System.out.println(0);
        }else {
            System.out.println((l*(l+1))%2019);
        }


    }
}
