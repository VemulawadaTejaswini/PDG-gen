import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2 == 1) {
            System.out.println(0);    
        }else {
            long ans = n/10;
            for(int i = 2; i<=18; i++) {
                long power = (long)Math.pow(10,i);
                ans += n/(power/2);
                System.err.println(power/2);
            }
            System.out.println(ans);
        }
    }
}