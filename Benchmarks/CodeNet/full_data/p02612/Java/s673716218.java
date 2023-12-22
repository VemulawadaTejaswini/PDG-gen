import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int bill = 0;
        while (bill < x) {
            bill += 1000;
        }
        System.out.println(bill - x);

    }
}