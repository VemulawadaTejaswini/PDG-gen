import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(k % 2 == 0) {
            int a = n / k;
            int b = n / (n / k);
            int c = b - a;
            System.out.println(a * a * a + c * c * c);
        } else {
            int a = n / k;
            System.out.println(a * a * a);
        }
    }
}