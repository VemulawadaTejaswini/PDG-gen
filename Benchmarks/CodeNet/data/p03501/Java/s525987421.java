import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int minPrice = b;
        int patternA = n * a;
        if (patternA < b) {
            minPrice = patternA;
        }

        System.out.println(minPrice);
    }
}
