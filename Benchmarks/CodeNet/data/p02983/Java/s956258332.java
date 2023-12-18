import java.io.IOException;
import java.util.*;

public class Main {
    public static int map[][]=new int[11][11];
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long L=sc.nextLong();
        long R=sc.nextLong();

        long diff=R-L;
        long lmod=L%2019;
        if(lmod+diff>=2019){
            System.out.println(0);
            return;
        }
        
        long ans=999999;
        for(long i=L;i<R;i++){
            for(long j=i+1;j<=R;j++){
                ans=Math.min(ans,i*j%2019);
            }
        }
        System.out.println(ans);
    }


}