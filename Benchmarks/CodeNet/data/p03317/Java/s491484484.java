import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt() - 1;
        int k = sc.nextInt() - 1;

        System.out.println((int)Math.ceil(n / k));
    }
}