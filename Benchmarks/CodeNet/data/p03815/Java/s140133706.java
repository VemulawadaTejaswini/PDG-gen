import java.util.*;

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = n / 11 * 2;
        if(n % 11 != 0 && n % 11 > 6){
            ans += 2;
        }else if(n % 11 != 0){
            ans++;
        }
        System.out.println(ans);
    }
}