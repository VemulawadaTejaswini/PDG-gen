import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double count = Math.ceil(num / 2) - 1.0;

        System.out.println((int) count);
    }
}