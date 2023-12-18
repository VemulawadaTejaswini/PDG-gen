import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int ans = sc.nextInt();
        for(int i = 0; i < N; i++){
            ans++;
            int a = sc.nextInt();
            ans += (D-1)/a;
        }
        System.out.println(ans);
        sc.close();

    }

}
