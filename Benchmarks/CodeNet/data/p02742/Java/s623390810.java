import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long H=sc.nextLong();
        long W=sc.nextLong();
        long ans=0L;
        
        if(W%2==0){
            ans=H*(W/2);
        }else{
            if(H%2==0){
                ans=W*(H/2);
            }else{
                ans=W*((H-1)/2)+(W+1)/2;
            }
        }
        
        System.out.println(ans);
    }
}
