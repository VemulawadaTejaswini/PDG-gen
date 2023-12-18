import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        long n = scan.nextInt();
        
        long ans = 1;
        long a = bignum();
        for(int i=0;i<n;i++)
        {
            ans = (ans*(i+1))%a;
        }
        System.out.println(ans);
    }
    
    static long bignum(){
        int i=0;
        long ans=1;
        while(i<9)
        {
            ans*=10;
            i++;
        }
        return ans+7;
    }
}
