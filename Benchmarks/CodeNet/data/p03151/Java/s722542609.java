import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[] dif = new long[n];
        long suma = 0;
        long sumb = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
            suma += a[i];
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextLong();
            sumb += b[i];
            dif[i] = a[i] - b[i];
        }

        if(suma < sumb){
            System.out.println(-1);
            return;
        }

        Arrays.sort(dif);
        long csum = 0;
        int ans = 0;

        for(int i=0; i<n; i++){
            if(dif[i] < 0){
                csum += dif[i];
                ans++;
            }else{
                break;
            }
        }

        for(int i=0; i<n; i++){
            if(csum >= 0) break;
            csum += dif[n-1-i];
            ans++;
            if(csum >= 0) break;
        }

        System.out.println(ans);
    }
}