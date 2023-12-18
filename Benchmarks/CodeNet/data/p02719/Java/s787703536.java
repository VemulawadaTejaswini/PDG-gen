import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long ans = 0;
        if(N <= K/2){
            ans = N;
        }else if(N < K){
            ans = K-N;
        }else{
            N = N%K;
            if(N<=K/2){
                ans = N;
            }else{
                ans = K-N;
            }
        }
        System.out.println(ans);
    }

}
