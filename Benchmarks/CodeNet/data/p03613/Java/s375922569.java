import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] c = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            c[i] = 1;
        }

        Arrays.sort(a);

        int count=1;
        int[] b = new int[n];
        int k=0;

        for(int i=0;i<n-1;i++){

            if(a[i]!=a[i+1]){
                b[k] = a[i];
                k++;
                if(i==n-2){
                    b[k] = a[i+1];
                    k++;
                }
            } else {
                c[k]++;
            }
        }

        int countmax=1;
        int countmax1 = 1;
        int countmax2 = 1;
        int countmax3 = 1;
        if(k==0) countmax = c[k];
        else if(k==1){
            if(b[0] +1 == b[1] || b[0] -1 == b[1]){
                countmax = c[0] + c[1];
            }else {
                if(c[0] >c[1]) countmax = c[0];
                else countmax = c[1];
            }
        }
        else {
            for (int i = 0; i < k - 1; i++) {
                if (countmax1 <= c[i]) countmax1 = c[i];
                if (b[i] + 1 == b[i + 1]) {
                    if (countmax2 <= c[i] + c[i + 1]) countmax2 = c[i] + c[i + 1];
                }
                if (i > 0) {
                    if ((b[i - 1] + b[i] + b[i + 1]) / 3 == b[i]) {
                        count = c[i - 1] + c[i] + c[i + 1];
                        if (countmax3 <= count) countmax3 = count;
                    }
                }
            }
            countmax = countmax1;
            if (countmax < countmax2) {
                countmax = countmax2;
            }
            if (countmax < countmax3) {
                countmax = countmax3;
            }
        }
        System.out.println(countmax);

    }
}
