import java.util.Scanner;

/**
 *
 * @author kke2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math[];
        int temp = 0;
        int j = 0;
        math = new int[4];
        int n = sc.nextInt();
        math[0] = n / 1000;
        n = n % 1000;
        math[1] = n / 100;
        n = n % 100;
        math[2] = n / 10;
        n = n % 10;
        math[3] = n;
        for (int i = 0; i <= 3; i++) {
            if (i == 0) {
                temp = math[0];
                continue;
            }
            if (temp == math[i]) {
                j++;
            } else {
                temp = math[i];
                j = 0;
            }
        }
        if (j >= 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}