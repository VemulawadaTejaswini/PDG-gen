import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int left[] = new int[n+1]; //左からの累積GCD配列
        int right[] = new int[n+1]; //右からの累積GCD配列
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            left[i+1] = gcd(left[i], a[i]);
        }
        for(int i=n-1; i >= 0; i--){
            right[i] = gcd(right[i+1], a[i]);
        }

        int gcd_max = 0;
        for(int i=0; i<n; i++){
            gcd_max = Math.max(gcd(left[i],right[i+1]),gcd_max);
        }
        System.out.println(gcd_max);
    }
    static int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
}