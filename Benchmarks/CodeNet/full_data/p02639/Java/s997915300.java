import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x[] = new int[5];

        // Enter x[0] - x[4]
        for(int i = 0; i < x.length; i++) {
            x[i] = scan.nextInt();
        }

        // Output x[i] if its value is 0
        for(int i = 0; i < x.length; i++) {
            if(x[i] == 0) {
                System.out.println(i + 1);
            }
        }

        scan.close();
    }
}