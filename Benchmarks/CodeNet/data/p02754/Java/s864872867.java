import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long blue = sc.nextLong();
        long red = sc.nextLong();
        long set = red + blue;

        long ans = (n / set)*blue;
        ans += (n%set)-red > 0?(n%set)-red:0;

        System.out.println(ans);
    }
}
