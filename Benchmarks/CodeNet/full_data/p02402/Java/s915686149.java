import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int [] array ={n};      
        int min = 1000000;
        int max = -1000000;
        int sum = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            sum = sum + a;
            if (a > max) {
                max = a;
            }if (min > a) {
                min = a;
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}