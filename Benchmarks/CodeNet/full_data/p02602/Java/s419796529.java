import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long[] list = new long[(int)n];
        for(int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        long[] tmp = new long[(int)n];
        tmp[0] = list[0];
        for(int i = 1; i < n; i ++ ) {
            tmp[i] = tmp[i-1]*list[i];
        }
        int l = 0;
        for(int i = 0; i < n - k; i++) {
            long a = tmp[(int)k+i];
            long b = tmp[(int)k-1+i];

            a /= tmp[l];
            tmp[(int)k+i] = a;
            l++;

            if(a > b) {
                System.out.println("Yes");
            } else if(a == b){
                System.out.println("No");
            } else {
                System.out.println("No");
            }
        }
    }
}
