import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a1 = sc.nextInt();
        if (n == 1) {
            if (a1 == k) {
                System.out.println("POSSIBLE"); return;
            } else {
                System.out.println("IMPOSSIBLE"); return;
            }
        }
        int a2 = sc.nextInt();
        int gcd = GCD1(a1, a2);

        int tmp;
        boolean greaterNumExists = false;
        if (a1 == k || a2 == k) {
            System.out.println("POSSIBLE"); return;
        }
        if (a1 > k || a2 > k) {
            greaterNumExists = true;
        }
        boolean allDivisibleByGCD = true;
        for (int i=2; i<n; i++) {
            tmp = sc.nextInt();
            if (gcd % tmp == 0) { gcd = tmp; }
            if (tmp == k) { System.out.println("POSSIBLE"); return; }
            if (!greaterNumExists && tmp > k) { greaterNumExists = true; }
            if (tmp % gcd != 0) { allDivisibleByGCD = false; }
        }
        if (!greaterNumExists) { System.out.println("IMPOSSIBLE"); return; }
        if (allDivisibleByGCD) {
            if (k % gcd != 0) {
                System.out.println("IMPOSSIBLE"); return;
            } 
        }
        System.out.println("POSSIBLE");
    }

    public static int GCD(int x, int y) {   
        int r;
        while (y!=0) {
            r = x%y; x = y; y = r;
        }
        return x;
    }

    public static int GCD1(int x, int y) {
        for (int i=2; i<=x && i<=y; i++) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
        }
        return 1;
    }
}