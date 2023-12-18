import java.util.*;

class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for(int i = 0; i < n; i++) nums[i] = sc.nextLong();
        sc.close();
        for(int i = 0; i < n - 1; i++){
            nums[i + 1] = lcm(nums[i] , nums[i + 1]);
        }
        System.out.println(nums[n - 1]);
    }
    public static long lcm(long a, long b){
        return a / gcd(a, b) * b;
    }
    public static long gcd(long a, long b){
        while(a % b != 0){
            return gcd(b, a%b);
        }
        return b;
    }
}