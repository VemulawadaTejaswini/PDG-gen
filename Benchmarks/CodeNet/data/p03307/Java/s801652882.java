import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int ans;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 2 == 0) ans = n;
        else ans = n * 2;

        System.out.println(ans);
    }

}
