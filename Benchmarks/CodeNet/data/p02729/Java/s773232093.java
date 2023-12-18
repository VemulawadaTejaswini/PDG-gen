import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        int ans = 0;
        for (int i = 0; i < N; i++) ans += i;
        for (int i = 0; i < M; i++) ans += i;
        
        System.out.println(ans);
    }
}
