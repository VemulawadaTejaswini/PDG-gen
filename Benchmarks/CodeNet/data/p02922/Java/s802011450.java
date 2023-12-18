import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b <= a) {
            System.out.println(1);
            return;
        }
        int sum = 0;
        for (int i = 1; ; i++) {
            if(sum > b) {
                System.out.println(i - 1);
                return;
            }
            sum += (a - 1) * i;
        }
    }
}