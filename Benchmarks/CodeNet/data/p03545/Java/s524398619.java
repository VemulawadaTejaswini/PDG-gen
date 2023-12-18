import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num / 1000;
        num = num - a * 1000;
        int b = num / 100;
        num = num - b * 100;
        int c = num / 10;
        int d = num % 10;
        int sum = a;
        for(int i = 0; i < 2; i++) {
            if(i == 0) sum += b;
            else sum -= b;
            for(int j = 0; j < 2; j++) {
                int temp1 = sum;
                if(j == 0) sum += c;
                else sum -= c;
                for(int k = 0; k < 2; k++) {
                    int temp2 = sum;
                    if(k == 0) sum += d;
                    else sum -= d;
                    if(sum == 7) {
                        System.out.println(a + toString(i) + b + toString(j) + c + toString(k) + d + "=7");
                        return;
                    }
                    sum = temp2;
                }
                sum = temp1;
            }
            sum = a;
        }
        return;
    }
    private static String toString(int n) {
        if(n == 0) return "+";
        else return "-";
    }
}
