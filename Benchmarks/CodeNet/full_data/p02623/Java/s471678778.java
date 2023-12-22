import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();

        long[] sumA = new long[n+1];
        long[] sumB = new long[m+1];

        for (int i=1; i<=n; i++) {
            long a = sc.nextLong();
            sumA[i] = sumA[i-1] + a;
        }

        for (int i=1; i<=m; i++) {
           long b = sc.nextLong();
            sumB[i] = sumB[i-1] + b;
        }

        int ans = 0;
        int flag = m;
        for(int i=0; i<=n; i++) {
            if(sumA[i]>k) break;
            while (sumB[flag]>k-sumA[i]&&flag>0) {
                flag--;
            }
            ans = Math.max(ans, i+flag);
        }
        System.out.print(ans);
    }
}
