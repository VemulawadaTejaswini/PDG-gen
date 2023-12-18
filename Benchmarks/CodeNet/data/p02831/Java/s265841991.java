import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long M = scan.nextLong();
        long ans = 0;
        if(M%N==0){
            ans=M;
        }else if(N%M==0){
            ans=N;
        }else{
            ans=N*M;
            for(int i=2;i<Math.min(N, M);i++){
                if(N%i==0 && M%i==0){
                    N/=i;
                    M/=i;
                    ans/=i;
                }
            }
        }
        System.out.println(ans);
    }
}
