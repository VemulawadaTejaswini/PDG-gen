import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result;
        if (n * m == 1) {
            result = 1;
        } else if (n == 1 || m == 1) {
            result = n * m - 2;
        } else {
            result = (n - 2) * (m - 2);
        }
        System.out.println(result);
    }
    
}
