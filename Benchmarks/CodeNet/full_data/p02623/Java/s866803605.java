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
        int count=0;
        boolean bool = true;
        while (bool){
            count++;
                boolean c = false;
                for (int i=0;i<=count&&!c;i++){
                    if ((!(count-i>m||i>n))&&a[i]+b[count-i]<=k)c=true;
                }
                if (!c){
                    bool=false;
                    count--;
                }

        }
        if (count>m+n)count--;
        System.out.println(count);
    }
}
