import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long[] ti = new long[n];
        for(int i = 0;i < n;i++) ti[i] = sc.nextLong();
        
        long sum = t;
        long r = t;
        for(int i = 1;i < n;i++) {
            long l = ti[i];
            if(l < r) {
                sum += t - r + ti[i];
                r = ti[i] + t;
            }
            else {
                sum += t;
                r = ti[i] + t;
            }
        }

        System.out.println(sum);
    }
}
