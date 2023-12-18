import java.util.*;
//mport java.io.*;


public class Main{

    static int INFTY = Integer.MAX_VALUE;
    static long num=1000000007;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m+1]; //n+1を入れたほうが都合がいい
        a[0] = sc.nextInt();
        for (int i=1;i<m;i++){
            a[i] = sc.nextInt();
            if(a[i]-a[i-1]==1){
                System.out.println(0);
                return;
            }
        }
        a[m]=n+1;
        long[] f = new long[n];
        f[0]=1;
        f[1]=1;
        for(int i=2;i<n;i++){
            f[i] = (f[i-1] + f[i-2]) % num;
        }
        //最初の区間だけ特別
        long ans = f[a[0]-1] % num;

        for(int i=1;i<=m;i++){
            //ans = ( ans % num ) * (f[a[i]-a[i-1]-1] % num ) * (f[a[i+1]-a[i]-1] % num) % num;
            ans = ( ans % num ) * (f[a[i]-a[i-1]-2]) % num;
        }
        System.out.println(ans);
    }
        

}