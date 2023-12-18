import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = x;
        boolean flag = true;
        long ans = 0;
        while (flag) {
            if (z > y) {
                flag = false;
                break;
            }
            ans++;
            z = z * 2;
        }
        System.out.println(ans);
    }
}