import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp = 0;
        for (int i = 1; i < 1000; i++) {
            tmp += i;
            if(tmp >= a) {
                System.out.println(tmp - a);
                return;
            }
        }
    }
}