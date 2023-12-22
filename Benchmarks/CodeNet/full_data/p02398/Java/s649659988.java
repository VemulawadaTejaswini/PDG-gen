import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}