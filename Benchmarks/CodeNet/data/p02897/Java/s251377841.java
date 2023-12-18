import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        if (n % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((n - (n / 2)) / (n * 1.0));
        }
    }
}