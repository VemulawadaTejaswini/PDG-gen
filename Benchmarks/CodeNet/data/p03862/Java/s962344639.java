
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long x=sc.nextLong();
        long a[] = new long[n];
        for(int i=0;i<n;i++)a[i]=sc.nextLong();
        long ans =0;

        for(int i=1;i<n/2;i++){
            if(a[i-1]+a[i]>x){
                long temp = a[i]+a[i-1]-x;
                ans += temp;
                a[i]-=temp;
            }
            if(a[n-i]+a[n-i-1]>x){
                long temp = a[n-i]+a[n-i-1]-x;
                ans += temp;
                a[n-i-1]-=temp;
            }
        }

        int half = (n-1)/2;
        if(n%2==1){
            if(a[half]+a[half+1]>x){
                long temp = (a[half] + a[half + 1]) - x;
                ans += temp;
                a[half]-=temp;
            }
            if(a[half-1]+a[half]>x){
                long temp = a[half-1]+a[half]-x;
                ans += temp;
                a[half]-=temp;
            }
        }
        if(n%2==0){
            if(a[half]+a[half+1]>x){
                long temp = (a[half] + a[half + 1]) - x;
                ans += temp;
                a[half]-=temp;
            }
        }

        System.out.println(ans);

    }
}
