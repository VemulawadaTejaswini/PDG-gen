import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n+1];
        long[] b = new long[m+1];
        a[0]=0;
        b[0]=0;
        for (int i=1;i<=n;i++)a[i]=a[i-1]+sc.nextLong();
        for (int i=1;i<=m;i++)b[i]=b[i-1]+sc.nextLong();
        int best = m;
        int i;
        int j=0;
        for (i=0;i<=n&&a[i]<=k;i++){
            boolean c = true;
            for (j=best;j>=0&&c;j--){
                if (a[i]+b[j]<=k){
                    c=false;
                    best=j;
                }
            }
        }
        System.out.println(i+j);
    }
}
