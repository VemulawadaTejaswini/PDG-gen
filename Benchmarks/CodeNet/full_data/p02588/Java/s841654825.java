import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
    static int div2Count(long n){
        int ans = 0;
        while(n%2 == 0){
            n /= 2;
            ans ++;
        }
        return ans;
    }
    static int div5Count(long n){
        int ans = 0;
        while(n%5 == 0){
            n /= 5;
            ans ++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigDecimal[] A = new BigDecimal[N];
        for(int n=0; n<N; n++){
            A[n] = new BigDecimal(sc.next());
        }
        long[] L = new long[N];
        for(int n=0; n<N; n++) L[n] = A[n].multiply(new BigDecimal(1000000000)).toBigInteger().longValue();
        
        long[][] d = new long[50][50];
        for(int n=0; n<N; n++){
            d[div2Count(L[n])][div5Count(L[n])]++;
        }

        long ans = 0;

        for(int i1=0; i1<50; i1++) for(int j1=0; j1<50; j1++){
            for(int i2=0; i2<50; i2++) for(int j2=0; j2<50; j2++){
                if((i1!=i2 || j1!=j2) && i1+i2>=18 && j1+j2>=18) {
                    ans += (d[i1][j1] * d[i2][j2]);
                }
            }
        }

        for(int i=0; i<50; i++) for(int j=0; j<50; j++){
            if(i+i>=18 && j+j>=18){
                ans += d[i][j] * (d[i][j]-1);
            }
        }

        ans /= 2;
        System.out.println(ans);
    }
}
