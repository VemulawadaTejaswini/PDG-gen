import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(price(A, B));
    }

    private static int price(int age, int price) {
        if (age <= 5) return 0;
        if (6 <= age && age <= 12) return price / 2;
        return price;
    }
}
