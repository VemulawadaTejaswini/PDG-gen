import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        boolean greaterNumExists = false;
        int gcd = 0, tmp;
        for (int i=0; i<n; i++) {
            tmp = sc.nextInt();
            if (tmp == k) { System.out.println("POSSIBLE"); return; }

            if (!greaterNumExists && tmp > k) { greaterNumExists = true; }

            if (gcd == 0) { gcd = tmp; }
            if (tmp % gcd != 0) { gcd = GCD(gcd, tmp); }

            if (greaterNumExists && k % gcd == 0) { System.out.println("POSSIBLE"); return; }
        }
        System.out.println("IMPOSSIBLE");
    }

    public static int GCD(int x, int y) {   
        int r;
        while (y!=0) {
            r = x%y; x = y; y = r;
        }
        return x;
    }
}
