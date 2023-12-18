import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = kys(a,b);
        int res = 1;
        res = res + bk(c,1,0);
        System.out.println(res);
    }
    static long kys(long a,long b){
        if(b == 0){return a;}
        return kys(b,a % b);
    }
    static int bk(long c,long j,int plus){
        if(c == 1){return plus;}else{
            for(long i = j+1;i<=c;i=i+1+i%2){
                if(c % i == 0){
                    plus++;
                    while(c % i == 0){
                        c = c / i;
                    }
                    return bk(c,i,plus);
                }
            }
        }
        return plus;
    }
}
