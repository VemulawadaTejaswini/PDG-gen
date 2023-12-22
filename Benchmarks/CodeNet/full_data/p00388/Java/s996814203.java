import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            if(h % i == 0) ans++;
        }
        System.out.println(ans);
    }
}
