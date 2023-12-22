import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int d = 0;
        int total = 0;
        total = a;
        d = k - a;
        if(d <= 0) {
            System.out.println(total);
            return;
        }
        d = k -a -b;
        if(d <= 0) {
            System.out.println(total);
            return;
        }
        total = a + (k - a - b) * -1;
        System.out.println(total);
    }
}