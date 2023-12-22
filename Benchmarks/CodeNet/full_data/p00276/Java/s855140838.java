import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int count = 0;
            while (a > 0 && b > 0 && c > 0) {
                a--;
                b--;
                c--;
                count++;
            }
            while (a > 1 && b > 0) {
                a -= 2;
                b--;
                count++;
            }
            while (a > 2) {
                a -= 3;
                count++;
            }
            System.out.println(count);
        }
    }
}
