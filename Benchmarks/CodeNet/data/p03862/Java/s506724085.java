import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        long ans = 0;
        for (int i=1;i<n;i++){
            int need = a[i-1]+a[i]-x;
            if (need>0){
                ans+=need;
                if (a[i]>=need){
                    a[i]-=need;
                }else {
                    a[i-1]-=need-a[i];
                    a[i]=0;
                }
            }
        }
        System.out.println(ans);
    }
}
