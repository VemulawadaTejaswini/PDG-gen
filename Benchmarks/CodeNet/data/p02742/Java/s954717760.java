import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long h=sc.nextInt();
        long w = sc.nextInt();
        long ans=0;
        for(int i=0;i<h;i++){
            if(i%2==0){
                if(w%2==1)ans+=w/2+1;
                else ans += w/2;
            }else{
                ans += w/2;
            }
            //4 5System.out.println(ans);
        }
        System.out.println(ans);

    }
}