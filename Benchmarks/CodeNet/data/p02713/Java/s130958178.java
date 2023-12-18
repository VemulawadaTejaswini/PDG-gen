import java.util.*;

class Main {
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        long sum = 0;

        for(int i = 1; i<= input; i++) {
            for(int p = 1; p <= input; p++) {
                for(int q = 1; q <= input ; q ++){
                    sum += gcd(gcd(i,p),q);
                }
            }
        }
        System.out.println(sum);
    }
}