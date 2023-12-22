import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int a = scanner.nextInt();
            if(a%2==1 && i%2==0) ans++;
        }

        System.out.println(ans);

    }



}
