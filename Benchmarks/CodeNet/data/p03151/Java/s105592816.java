import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int asum = 0;
        int[] b = new int[N];
        int[] d = new int[N];
        int bsum = 0;
        long msum = 0;
        int ans = 0;
        for(int i = 0; i < N; i++){ a[i] = sc.nextInt(); asum += a[i];}
        for(int i = 0; i < N; i++){
            b[i] = sc.nextInt();
            bsum += b[i];
            d[i] = a[i] - b[i];
            if(d[i] <0) {msum += d[i]; ans++;}
            }
        if(asum < bsum){
            System.out.println(-1);
        }else{
            Arrays.sort(d);
            int idx = N-1;
            while(msum < 0){
                ans++;
                msum += d[idx];
                idx--;
            }
            System.out.println(ans);
        }
        sc.close();
    }

}
