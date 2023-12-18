import java.util.*;

public class Main {

    static int MOD = 1000000007;
    public static void main(String[] args) {

        int ans=0;
        Scanner sc = new Scanner(System.in);
       // int a=sc.nextInt(),b=sc.nextInt();
       int n=sc.nextInt();
      //  String s=sc.next();
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            boolean ok=true;
            for(int j=0;j<i;j++){
                if(p[i]>p[j]){
                    ok=false;
                    break;
                }

            }
            if(ok){
                ans++;
                //System.out.println(i);
            }
        }
        System.out.println(ans);

    }

}
