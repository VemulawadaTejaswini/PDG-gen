import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }
 
    void solve(Scanner sc) {
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            while (a % 2 == 0 && a >= 2) {
                count++;
                a /= 2;
            }
        }
        System.out.println(count);
    }
}