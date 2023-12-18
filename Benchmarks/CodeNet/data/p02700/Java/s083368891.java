
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
        System.out.println(a);
        System.out.println(c);
        System.out.println(count);
        if (a <= 0) {
            //高橋君まけ
            System.out.println("No");
            return;
        }
        if (c <= 0) {
            //青木君まけ
            System.out.println("Yes");
            return;
        }
        if (count % 2 == 0){
            c = c - b;
        }else {
            a = a - d;

        }
        attack(a, b, c, d, ++count);
    }
}
