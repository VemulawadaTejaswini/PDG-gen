import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        int v = sc.nextInt();
        int p = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);

        boolean flag = true;

        int l = 0, r = n-p+1;

        while (l<r){
            int mid = (l+r)/2;
            if (a[mid]+m<a[n-p]){
                flag = false;
            }else {
                long sum = (p-1+mid+1)*m;
                for (int i=mid+1; i<=n-p; i++){
                    sum += a[mid]+m-a[i];
                }
                if (sum<m*v) flag = false;
                else flag = true;
            }
            if (flag) r = mid;
            else l = mid+1;
        }
        System.out.println(n-l);
    }
}
