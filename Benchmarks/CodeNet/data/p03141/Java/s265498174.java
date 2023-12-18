import java.util.Arrays;
import java.util.Scanner;
public class Main{
	
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long [] s = new long[n];
        long ans = 0;
        for(int i=0;i<n;i++) {
        	a[i] = sc.nextLong();
        	b[i] = sc.nextLong();
        	s[i] = a[i] + b[i];
        	ans -= b[i];
        }
        
        Arrays.sort(s);
        
        for(int i=n-1;i>=0;i-=2) {
        	ans += s[i];
        }
        System.out.println(ans);
    }
}
