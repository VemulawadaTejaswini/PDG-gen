import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static boolean found = false;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();


        while ((a % x) != 0) {
            a++;
        }
        if (a > b) {
            System.out.println("0");
            return;
        }
        long ans = ((b - a) / x) + 1;
        System.out.println(ans);
    }

}