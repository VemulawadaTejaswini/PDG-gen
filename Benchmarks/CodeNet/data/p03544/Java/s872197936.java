import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0l;
        long l0 = 2;
        long l1 = 1;
        for (int i = 1; i < n; i++) {
            ans = l0 + l1;
            l0 = l1;
            l1 = ans;
        }
        System.out.println(ans);
    }
}