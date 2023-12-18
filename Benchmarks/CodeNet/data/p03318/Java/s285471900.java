import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long cnt = 0;
        for(long i = 1; i <= 10;i++){
            if(cnt >= k){
                break;
            }
            if(i*sum(i+1) <= (i+1)*sum(i)){
                cnt++;
                System.out.println(i);
            }
        }
        long x = 19;
        for(long i = 10; i <= k;i++){
            System.out.println(x);
            x += 10;
        }
    }
    public static long sum(long x){
        long ans = 0;
        while(x != 0){
            ans += x % 10;
            x /= 10;
        }
        return ans;
    }
}
