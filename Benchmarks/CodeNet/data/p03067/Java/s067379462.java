import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        scan.close();

        if (a < b) {
            if (a < c && c < b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if (b < c && c < a) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

}