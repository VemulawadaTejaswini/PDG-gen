import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        boolean nodec = true;
        for(int i=1; i<n; i++){
            if(a[i] <= a[i-1]) nodec = false;
        }
        if(nodec){
            System.out.println(1);
            return;
        }

        int m = 400000;
        int[] dec = new int[m];
        for(int i=1; i<n; i++){
            if(a[i] <= a[i-1] && a[i] < m) dec[a[i]-1]++;
        }

        int l=0, r = m;
        while(r-l>1){
            int mid = (l+r)/2;
            int[] mdec = Arrays.copyOf(dec, dec.length);
            for(int i=m-1; i>0; i--){
                if(mdec[i] > mid){
                    mdec[i-1] += mdec[i] - mid;
                }
            }
            if(mdec[0] > mid){
                l = mid;
            }else{
                r = mid;
            }
        }

        System.out.println(r+1);
    }
}