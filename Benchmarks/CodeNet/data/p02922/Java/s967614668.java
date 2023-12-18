import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        
        if(B==1){
            System.out.println(0);
            return ;
        }
        
        int ans=0;
        int num=1;
        
        while(num<B){
            num+=A-1;
            ans++;
        }
        
        System.out.println(ans);
    }
}
