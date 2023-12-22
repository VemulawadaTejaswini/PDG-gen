import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble() * 100;
        long ans = (long)(a * b / 100);
        System.out.println(ans);
        sc.close();

    }

}
