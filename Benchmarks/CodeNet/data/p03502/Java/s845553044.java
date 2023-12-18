import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isHarshad = false;
        if (n % sumDigits(n) == 0) isHarshad = true;

        System.out.println(isHarshad ? "Yes" : "No");
    }

    private static int sumDigits(int num){
        int sum = 0;

        while (num > 0) {
            sum = sum + (num % 10);
            num /= 10;
        }

        return sum;
    }
}
