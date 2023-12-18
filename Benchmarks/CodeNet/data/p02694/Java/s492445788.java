import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long en = 100;
        int ans = 1;
        while (x>en) {
            en += en/100;
            ans++;
        }
        System.out.println(ans);
    }
}
