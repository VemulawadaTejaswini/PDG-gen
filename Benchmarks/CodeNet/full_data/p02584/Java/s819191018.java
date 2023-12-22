import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();
        
        long num1,num2;
        long p,m,ans1,ans2;
        
        for(int i=0;i<=K;i++){
            p=X+D;
            m=X-D;
            ans1=Math.abs(Math.abs(p));
            ans2=Math.abs(Math.abs(m));
            if(ans1<=ans2){
                X=ans1;
            }else{
                X=ans2;
            }
            if(X==0){
                if(i % 2 == 0){
                    if(X%2==0){
                        System.out.println(X+D);
                    }else{
                        System.out.println("0");
                    }
                }else{
                    if(X%2==0){
                        System.out.println("0");
                        return;
                    }else{
                        System.out.println(X+D);
                    }
                }
                return;
            }
        }
        
        System.out.println(X);
    }
}
