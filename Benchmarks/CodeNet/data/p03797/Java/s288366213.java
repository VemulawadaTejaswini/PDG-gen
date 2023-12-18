import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long ans = 0;
        if(m-2*n >= 0){
            ans += n;
            m -= 2*n;
        }
        ans += m / 4;

        System.out.println(ans);
    }
}
