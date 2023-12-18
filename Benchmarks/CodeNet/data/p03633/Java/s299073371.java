import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums=new long[n];
        long[] output=new long[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextLong();
        }
        output[0]=nums[0];
        long ans=1;
        for(int i=1;i<n;i++){
            output[i]=nums[i]/Euclid(nums[i],output[i-1])*output[i-1];
        }
        System.out.println(output[n-1]);
    }
 
    private static long Euclid(long n, long m) {
        long tmp;
        if(n==0||m==0){
            return Math.max(n,m);
        }
        while (true) {
            if (n == 0) {
                return m;
            } else if (m == 0) {
                return n;
            }
            tmp = n;
            n = m;
            m = tmp;
            n = n % m;
 
        }
    }
}