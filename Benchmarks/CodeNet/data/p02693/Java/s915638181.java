import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (true) {
            k += k;
            if ((a <= k) && (k <= b)) {
                System.out.println("OK");
                break;
            }
            if (k > b) {
                System.out.println("NG");
                break;
            }
        }

        sc.close();
    }

}
