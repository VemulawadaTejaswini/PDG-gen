
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        attack(a, b, c, d, count);
    }

    public static void attack(int a, int b, int c, int d, int count){
        if (a <= 0){
            if (c > 0){
                System.out.println("No");
                return;
            } else {
                System.out.println("yes");
                return;
            }
        }
        if (count % 2 == 0)
            attack(a, b, c - b, d, ++count);
        else
            attack(a - d, b, c, d, ++count);
    }
}
