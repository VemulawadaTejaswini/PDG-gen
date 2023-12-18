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
        for(int i=1;i<k-1;i++){
            if((b[i-1] + b[i] + b[i+1])/3==b[i]){
                count = c[i-1] + c[i] + c[i+1];
                if(countmax<count) countmax = count;
            }
        }
        System.out.println(countmax);

    }
}
