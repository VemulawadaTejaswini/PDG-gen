import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = Math.abs(scanner.nextInt() - m);
        }
        int cur = x[0];
        for(int i = 1; i < n; i++){
            cur = calcGcd(cur, x[i]);
        }
        System.out.println(cur);
    }
    // 最大公約数を求める。
    static int calcGcd(int m, int n) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Arguments must be 1 and over.");
        }
        if(m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        int remainder = 0;
        while ((remainder = m % n) != 0) {
            m = n;
            n = remainder;
        }
        return n;
    }
}
