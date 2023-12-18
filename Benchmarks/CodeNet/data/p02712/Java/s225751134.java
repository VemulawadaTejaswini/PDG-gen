import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            if(i % 3 != 0 && i % 5 != 0) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}