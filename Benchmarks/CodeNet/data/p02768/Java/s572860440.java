import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        String s = Integer.toBinaryString(n);
        long ans = powerMOD(2,n);
        long A = comMOD(n,a);
        long B = comMOD(n,b);
        System.out.println((ans-1-A-B+1000000007)%1000000007);
    }

    static long powerMOD(long r, long n){
        String s = Long.toBinaryString(n);
        long ans = 1;
        if (r==1||r==0)return r;
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)!='0')ans=(ans*r*(s.charAt(i)-'0'))%1000000007;
            r=r*r%1000000007;
        }
        return ans;
    }
    static long e97Div(long n, long y){
        return (n*powerMOD(y, 1000000005L))%1000000007;
    }
    static long comMOD(int n, int r){
        r = Math.min(r,n-r);
        long MOD = 1000000007;
        long ans = 1;
        for (int i=0;i<r;i++){
            ans=ans*(n-i)%MOD;
        }
        for (int i=r;i>0;i--){
            ans = e97Div(ans,i);
        }
        return ans;
    }
}
