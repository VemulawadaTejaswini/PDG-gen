import java.util.*;

public class Main {

    public static int harshad(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static String isHarshad(int n) {
        return n % harshad(n) == 0 ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isHarshad(sc.nextInt()));
    }

}
