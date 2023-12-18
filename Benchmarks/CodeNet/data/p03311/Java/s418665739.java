import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int a[] = new int [n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();    
        sc.close();
        int ans = 1000000000;
        int b = 0;
        for (int i = 0; i < n; i++) {
            b = a[i] - (i + 1) ;
            ans = Math.min(ans,calc(b - 1,n,a));  
            ans = Math.min(ans,calc(b + 1,n,a));  
            ans = Math.min(ans,calc(b,n,a));
            //System.out.print(b + " " + a[i] + " " + ans);
            //System.out.println("");     
        } 
        System.out.println(ans);
    }
    private static int calc(int b,int n,int a[]){
        int sum = 0;
        for(int i = 1;i <= n;i++){
            sum += Math.abs(a[i - 1] - (i + b));
        }
        return sum;
    }
}