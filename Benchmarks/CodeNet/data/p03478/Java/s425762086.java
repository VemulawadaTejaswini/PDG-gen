import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a; i <= n; i++) {
            int x = i;
            int total = x % 10;
            while (x >= 10) {
                x /= 10;
                total += x % 10;
            }
            
            if (total >= a && total <= b)
                cnt += i;
        }
        
        System.out.println(cnt);
    }
}
