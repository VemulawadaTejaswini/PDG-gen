import java.util.*;

public class d_main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; ++i){
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n-1; ++i){
            if (a[i] < 0){
                a[i] = a[i]*(-1);
                a[i+1] = a[i+1]*(-1);
            }
        }
        if (a[n-1] < 0 && Math.abs(a[n-2]) < Math.abs(a[n-1])){
            a[n-2] = a[n-2] * (-1);
            a[n-1] = a[n-1] * (-1);
        }

        long sum = 0;

        for (int i = 0; i < n; ++i){
            sum += a[i];
        }
        System.out.println(sum);
    }
}
