import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long ans = 0;
        if(M-2*N >= 0){
            ans += N;
            ans += (M-2*N)/4;
        }else{
            ans += M/2;
        }
        System.out.println(ans);
    }
}