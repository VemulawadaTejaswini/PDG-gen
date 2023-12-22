
import java.util.Scanner;  // Import the Scanner class

public class Main {

    // Payment
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amt = in.nextInt();
        System.out.println("given money : " + amt);
        int rem = amt % 1000;
        System.out.println((rem != 0) ? 1000 - rem : 0);
    }


}
