import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n+2];
        long ans = 0;
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            if(a[i]+a[i-1]>x){
                ans += a[i]+a[i-1]-x;
                a[i]=x-a[i-1];
            }
        }
        System.out.println(ans);
    }
}
