import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a;
        for (int i = 0; i < n; i++) {
            a = s.nextInt();
            k -= s.nextInt();
            if (k <= 0) {
                System.out.println(a);
                break;
            }
        }
    }
}