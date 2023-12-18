import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int result = 0;
        for(int i = 0;i < n; i++) {
            int ele = s.nextInt();
            ele = abs(x-ele);
            if(i != 0) {
                result = gcd(result,ele);
            } else {
                result = ele;
            }
        }
        System.out.println(result);
    }
    static int gcd(int a, int b) {
        if(a == 0)
            return b;
        return gcd(b%a,a);
    }
    static int abs(int a) {
        return a < 0 ? -a : a;
    }
}
