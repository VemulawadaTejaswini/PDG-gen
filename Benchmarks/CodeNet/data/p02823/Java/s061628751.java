import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long A = scan.nextLong();
        long B = scan.nextLong();
        long ans = 0;
        if((A+B)%2 == 0){
            ans = (A+B)/2 - A;
        }else{
            ans = Math.min(N-B, N-A);
        }
        System.out.println(ans);
    }
}
