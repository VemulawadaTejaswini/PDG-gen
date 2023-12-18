import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = Math.max(a,b);
        int ans = 0;
        for (int i = x; 0 < i; i--) {
            int y = a - i;
            int z = b - i;
            if (Math.abs(y) == Math.abs(z)) {
                ans = i;
                break;
            }
        }
        if (ans == 0) {
            System.out.println("IMPOSSIBLE");
            System.exit(0);
        }
        System.out.println(ans);
    }
}