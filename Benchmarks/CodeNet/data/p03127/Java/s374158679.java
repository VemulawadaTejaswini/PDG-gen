import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = sc.nextInt();
        for (int i = 1; i < N; i++) {
            ans = gcd(ans, sc.nextInt());
        }

        System.out.println(ans);
        sc.close();

    }

    public static int gcd(int a, int b){
        if(a < b) return gcd(b, a);
        if(b == 0) return a;
        return gcd(b, a%b);
    }

}
