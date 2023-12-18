import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int ok = d * 2 + 1;
        int ans = n / ok;
        if (n % ok != 0) {
            ans++;
        }
        System.out.println(ans);

        sc.close();
    }
}
