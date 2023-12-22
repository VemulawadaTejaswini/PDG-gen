import java.util.Scanner;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();


        int largest = (b / k) * k;

        if (largest >= a) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

    }
}
