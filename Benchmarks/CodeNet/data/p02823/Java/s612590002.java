import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long A = scan.nextLong();
        long B = scan.nextLong();

        long a = N-A;
        long b = B-1;
        long ans = Math.min(a, b);
        if((A+B)%2 == 0){
            ans = Math.min((A+B)/2-A, ans);
        }
        System.out.println(ans);
    }
}
