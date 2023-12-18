import java.util.*;

public class Main {

    static int MOD = 1000000007;
    public static void main(String[] args) {

        int ans=1;
        Scanner sc = new Scanner(System.in);
        // int a=sc.nextInt(),b=sc.nextInt();
        int n=Integer.parseInt(sc.next());
        //  String s=sc.next();
        int[] p = new int[n];
        int[] s = new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        s[0]=p[0];
        for(int i=1;i<n;i++)s[i]=s[i-1]+p[i];


        for(int i=1;i<n;i++){
            boolean ok=true;
            if(s[i-1]<=p[i]*i){
                ok=false;
            }else {
                for(int j=0;j<i;j++){
                    if(p[i]>p[j]){
                        ok=false;
                        break;
                    }

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
