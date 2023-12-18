import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];        
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextLong();
        }

        long[] num = new long[30];
        long ans = 0;
        
        for(int i=0; i<30; i++){
            long[] ta = new long[n];
            long[] tb = new long[n];
            for(int j=0; j<n; j++){
                ta[j] = a[j] % (2 << i);
                tb[j] = b[j] % (2 << i);
            }
            Arrays.sort(tb);
            for(int j=0; j<n; j++){
                long tmp1 = myBinarySearch(tb, (2 << i) / 2 - ta[j]);
                long tmp2 = myBinarySearch(tb, (2 << i) - ta[j]);
                long tmp3 = myBinarySearch(tb, (2 << i) / 2 * 3 - ta[j]);
                long tmp4 = myBinarySearch(tb, (2 << i) / 2 * 4 - ta[j]);                
                //if(tmp1 < 0) tmp1 = -tmp1 - 1;
                //if(tmp2 < 0) tmp2 = -tmp2 - 1;
                num[i] += tmp2 - tmp1 + tmp4 - tmp3;
            }

            if(num[i] % 2 == 1) ans += (2 << i) / 2;
        }

        System.out.println(ans);
    }
    
    public static int myBinarySearch(long[] la, long key){
        int l = -1;
        int r = la.length;
        while(r - l > 1){
            int m = (l + r) / 2;
            if(la[m] >= key){
                r = m;
            }else{
                l = m;
            }
        }
        return r;
    }
}