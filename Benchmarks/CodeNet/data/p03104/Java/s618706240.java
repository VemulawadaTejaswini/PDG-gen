import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = 0;
        long tmp = (a % 2) + (b - a) / 2;
        if(tmp % 2 != 0) ans += 1;
        for (long i = 2; i < b*2; i *= 2) {
            long c = 0;
            long r1 = a % (i * 2);
            if(r1 >= i) c += (i*2) - r1;
            long r2 = b % (i * 2);
            if(r2 >= i) c += r2 - (i * 2 - 1);
            if(c % 2 != 0){
                ans += i;
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
