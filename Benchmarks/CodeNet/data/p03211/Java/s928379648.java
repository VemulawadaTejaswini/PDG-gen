import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int love = 753;
        int minDiff = 10000;

        do {
            int a = n % 1000;
            int diff = Math.abs(love - a);
            if (minDiff > diff)
                minDiff = diff;
            n = n / 10;
        } while (n > 100);
        System.out.println(minDiff);
    }
}
