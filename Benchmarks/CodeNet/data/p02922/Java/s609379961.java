import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b == 1) {
            System.out.println(0);
            return;
        }
        if(b <= a) {
            System.out.println(1);
            return;
        }
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += a;
            if(sum >= b) {
                System.out.println(i);
                return;
            }
            sum -= 1;
        }
    }
}