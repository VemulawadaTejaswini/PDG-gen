import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long MOD = 998244353;
        int n = sc.nextInt();
        int node[] = new int[n];
        for(int i=0;i<n;i++)node[i]=0;
        int d = sc.nextInt();
        if(d!=0){
            System.out.println(0);
            return;
        }
        for(int i=1;i<n;i++){
            d = sc.nextInt();
            node[d]++;
        }

        
        if(node[0]!=1){
            System.out.println(0);
            return;
        }
        long ans = 1;
        for(int i=1;i<n;i++){
            for(int j=0;j<node[i];j++){
                ans *= node[i-1];
                ans %= MOD;
            }
        }
        System.out.println(ans);



    }
}
