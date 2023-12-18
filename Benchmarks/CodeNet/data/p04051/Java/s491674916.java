import java.util.Scanner;

public class Main{
    private static final int MOD = 1000000007;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        long[][] p = new long[4002][4002];
        long[][] d = new long[4002][4002];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            p[2001-a[i]][2001-b[i]]++;
        }
        d[1][1]=1;
        for(int i=1;i<4002;i++)for(int j=1;j<4002;j++){
            p[i][j]+=(p[i-1][j]%MOD+p[i][j-1]%MOD)%MOD;
            d[i][j]+=(d[i-1][j]%MOD+d[i][j-1]%MOD)%MOD;
        }
        long ans = 0L;
        long dbl = 0L;
        for(int i=0;i<n;i++){
            ans=(ans+p[2001+a[i]][2001+b[i]])%MOD;
            dbl=(dbl+d[2*a[i]+1][2*b[i]+1])%MOD;
        }
        System.out.println((ans-dbl)*500000004%MOD);
    }
}