import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();
        sc.close();
        long ans = 0;
        if(a >= k){
            ans = a;
        } else if (a+b >= k){
            ans = a;
        } else if (a+ b < k){
            ans = a - 1*(k-a-b);
        }
        System.out.println(ans);
    }
}