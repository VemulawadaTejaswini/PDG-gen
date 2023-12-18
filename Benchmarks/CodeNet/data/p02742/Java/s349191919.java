import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long ans = 0;
        
        if(H==1 || W==1){
            ans = 1;
        }else{
            ans = H*W;
        }
        
        if(ans%2==0){
            ans = ans/2;
        }else{
            ans = ans/2 + 1;
        }
        System.out.println(ans);
    }
}