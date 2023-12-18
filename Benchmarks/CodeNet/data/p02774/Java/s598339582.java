import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static long[] A;
    private static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        N = sc.nextInt();
        int K = sc.nextInt();
        A = new long[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
        //System.out.println(getCntUnder(-8));
        //System.out.println(getCntUnder(-7));
        //System.out.println(getCntUnder(-6));

        long l=-1_000_000_000_000_000_000L;
        long r=1_000_000_000_000_000_000L;
        while(l<r){
            long m = (l+r)>=0 ? (l+r)/2 : (l+r+1)/2-1;
            if(getCntUnder(m) < K){
                l = m+1;
            }else{
                r = m;
            }
            //if(l<-200){break;}
        }
        System.out.println(l);
    }

    private static long getCntUnder(long k){
        long sum = 0;
        for(int i=0;i<N-1;i++){
            if(A[i] == 0){
                sum += (N-1-i);
                continue;
            }
            long tgt = k / A[i];
            if(k < 0 && A[i] < 0 && ((-k) % (-A[i]) != 0)){
                tgt ++;
            }
            int l=i+1;
            int r=N-1;
            if(A[i] > 0) {
                while (l < r) {
                    int m = (l + r - 1) / 2 + 1;
                    if (tgt < A[m]) {
                        r = m - 1;
                    } else {
                        l = m;
                    }
                }
                //System.out.println(i + ":" + l);
                if(l < N && i < l && A[l] <= tgt){
                    sum += (l-i);
                }
            }else{
                while(l < r){
                    int m=(l+r)/2;
                    if(tgt > A[m]){
                        l = m+1;
                    }else{
                        r = m;
                    }
                }
                //System.out.println(i + ":" + l);
                if(l < N && i < l && A[l] >= tgt){
                    sum += (N-l);
                }
            }
        }
        return sum;
    }
}
