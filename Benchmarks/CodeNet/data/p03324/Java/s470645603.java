import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int num = 0;
        if (n == 100) {
            num = n + 1;
        } else {
            num = n;
        }
        System.out.println((int) (n * Math.pow(num, d)));
    }

}
