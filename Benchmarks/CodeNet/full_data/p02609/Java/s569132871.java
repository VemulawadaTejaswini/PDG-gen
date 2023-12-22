import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        for (int i=0;i<n;i++){
            long num = Long.parseLong(s,2);
            if (s.charAt(i)=='0')num+=(int)Math.pow(2,n-i-1);
            else num-=(int)Math.pow(2,n-i-1);
            System.out.println(function(num));
        }
    }
    static long function(long n){
        long ans = 0;
        while (n>0){
            ans++;
            n = n%pop(n);
        }
        return ans;
    }
    static long pop(long n){
        long ans = 0;
        while (n>0){
            ans+=n%2;
            n/=2;
        }
        return ans;
    }

}
