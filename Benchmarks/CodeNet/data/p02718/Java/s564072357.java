import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){ a[i]=sc.nextInt(); sum+=a[i]; }
        double val = sum/(m*4) ;
        Arrays.sort(a);
        int ans = 0;
        for(int i=n-1;i>=n-m;i--){
            System.out.println(val);
            if(a[i]<=val){ ans=-1; break; }
        }
        if(ans==-1) System.out.println("No");
        else System.out.println("yes");
     }
}