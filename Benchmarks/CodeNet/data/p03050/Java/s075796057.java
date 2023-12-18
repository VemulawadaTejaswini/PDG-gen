import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum=0;
        for (long i = 1;i<=n;i++){
            int sho = n/i;
            int amari =n%i;
            if(sho==amari) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
