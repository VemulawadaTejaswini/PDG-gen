import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        
        int ans = 0;
        for (int i = a; i <= t; i+= a) {
            ans += b;
        }
        
        System.out.println(ans);
    }
}
