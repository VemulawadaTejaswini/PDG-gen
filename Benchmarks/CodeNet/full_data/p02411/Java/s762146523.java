import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int x = m + f;
            if (m == -1 && f == -1 && r == -1) break;

            if (m == -1 || f == -1) {
                System.out.println("F");
            } else {
                if (x >= 80) System.out.println("A");
                if (65 <= x && x < 80) System.out.println("B");
                if (50 <= x && x < 65) System.out.println("C");
                if (30 <= x && x < 50) {
                    if (r >= 50) System.out.println("C");
                    else System.out.println("D");
                }
                if(x<30) System.out.println("F");
            }
        }
    }
}
