import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextLong();
        }
        long sum = 0;
        int l=0;
        int r=N-1;
        while(l<r){
            int lmaxind = 0;
            long lmaxVal = -1;
            for(int j=0;j<N;j++){
                if(A[j] * (long)Math.abs(j-l) > lmaxVal){
                    lmaxVal = A[j] * (long)Math.abs(j-l);
                    lmaxind = j;
                }
            }
            int rmaxind = 0;
            long rmaxVal = -1;
            for(int j=0;j<N;j++){
                if(A[j] * (long)Math.abs(j-r) > rmaxVal){
                    rmaxVal = A[j] * (long)Math.abs(j-r);
                    rmaxind = j;
                }
            }
            if(lmaxVal > rmaxVal){
                sum += lmaxVal;
                A[lmaxind]=0;
                l++;
            }else{
                sum += rmaxVal;
                A[rmaxind]=0;
                r--;
            }
        }
        System.out.println(sum);
    }

}
