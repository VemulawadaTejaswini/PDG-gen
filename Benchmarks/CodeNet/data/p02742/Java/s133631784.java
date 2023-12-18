import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long ans = 0;
        
        if(H%2==0){
            ans = W*(H/2);
        }else{
            if(W%2==0){
                ans = W*(H/2)+W/2;
            }else{
                ans = W*(H/2)+(W/2)+1;
                //System.out.println(H);
                //System.out.println(W*(H/2));
            }
        }
        System.out.println(ans);
    }
}