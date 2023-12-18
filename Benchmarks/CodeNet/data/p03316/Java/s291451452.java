import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sn = 0;
        int m = n;
        while (m > 0) {
            sn += m % 10;
            m /= 10;
        }
        System.out.println((n % sn == 0 ? "Yes" : "No"));
    }
}