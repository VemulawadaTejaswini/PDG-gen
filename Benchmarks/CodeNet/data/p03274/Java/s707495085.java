import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        long N = sc.nextLong();
        long K = sc.nextLong();
        long[] x = new long[N];
        for(int i = 0; i < N; i++){
            x[i] = sc.nextlong();
        }
        sc.close();

        long left = left_num(x);
        long right;
        long xl = 0;
        long xr = 0;
        long min = 2*(x[N-1] - x[0]);
            right = N - left;
            //i:左側の個数
            for(int i = 0; i <= Math.min(left, K); i++){
                long j = K-i; //右側に行く個数
                if(right < j)
                    continue;
                else{
                    if(i == 0){
                        min = Math.min(min, Math.abs(x[left+K-1]));
                    }
                    if(j == 0)
                        min = Math.min(min, Math.abs(x[left-K]));
                    if(i > 0 && j > 0){
                        xl = x[left-i];
                        xr = x[left+j-1];
                        long dis = Math.min((Math.abs(xl) + Math.abs(xl-xr)),
                                             (Math.abs(xr) + Math.abs(xl-xr)));
                        min = Math.min(min, dis);
                    }
                }
            }
        System.out.println(min);

    }
    static long left_num(long[] a){
        long index = 0;
        while(a[index] < 0){
            index++;
        }
        return index;
    }
}