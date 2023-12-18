import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(k == 1 || n == k){
            System.out.println("0");
        }else if(n > k){
            long t = n % k;
            long t1 = k - t;
            System.out.println(Long.min(t, t1));
        }else{
            long t = k - n;
            System.out.println(Long.min(t, n));
        }
    }
}