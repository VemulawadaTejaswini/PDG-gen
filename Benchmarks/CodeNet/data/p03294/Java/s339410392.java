import java.util.*;
public class Main {
    static long lcm(long a, long b){
        return (a*b)/gcd(a,b);
    }
    static long gcd(long a, long b){
        if(a<b){
            long t = a;
            a =b;
            b=t;
        }
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long ans = arr[0];
        for(int i=1;i<n;i++){
            ans = lcm(ans, arr[i]);
        }
        long temp = 0;
        for(int i=0;i<n;i++){
            temp+=(ans-1)%arr[i];
        }
        System.out.println(temp);
    }
}
