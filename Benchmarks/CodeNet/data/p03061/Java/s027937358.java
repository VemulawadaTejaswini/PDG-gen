import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int max;
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        max = maxGcd(A);
        System.out.println(max);
    }

    private static int maxGcd(int num[]){
        int len = num.length;
        int max = 0;
        for(int i = 0; i < len; i++) {
            int tmp = num[i];
            if(i == 0){
                num[i] = num[1];
            } else {
                num[i] = num[i - 1];
            }
            max = Math.max(max, gcdOfArray(num));
            num[i] = tmp;
        }
        return max;
    }

    private static int gcdOfArray(int num[]){
        int len = num.length;
        int gcd = gcd(num[0], num[1]);
        for(int i = 2; i < len; i++){
            gcd = gcd(gcd, num[i]);
        }
        return gcd;
    }
    private static int gcd(int m, int n) {
        if(m < n)
            return gcd(n, m);
        if(n == 0)
            return m;
        return gcd(n, m % n);
    }
}
