import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        long[] c=new long[200];
        for(int i=2;i<60;i++){
            for(int j=2;j<=i;j=j+2){
                c[i]+=calcCombination(i,j);
            }
        }
        int[] result=new int[200];
        int sum=0;
        int num=1;
        while(N!=0){
            for(int i=2;i<60;i++){
                if(c[i]>N){
                    N-=c[i-1];
                    for(int j=0;j<i-1;j++){
                        result[sum]=num;
                        sum++;
                    }
                    num++;
                    break;
                }
            }
        }
        System.out.println(sum);
        for(int i=0;i<sum;i++){
            System.out.print(result[i]+" ");
        }

    }
    static long calcCombination( int n, int m ) {
        if( n < m || m < 0 ) {
            throw new IllegalArgumentException( "引数の値が不正です ( n : " + n + ", m : " + m + ")" );
        }
        long c = 1;
        m = ( n - m < m ? n - m : m );
        for( int ns = n - m + 1, ms = 1; ms <= m; ns ++, ms ++ ) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}