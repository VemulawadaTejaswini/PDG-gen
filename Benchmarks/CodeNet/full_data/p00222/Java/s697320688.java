import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int MAX = 10000001;
        int[] p = new int[MAX];
        for(int i=2; i<p.length; i++) p[i] = 1;
        for(int i=2; i<Math.sqrt(MAX)+1; i++){
            for(int j=i*2; j<MAX; j+=i){
                p[j] = 0;
            }
        }

        int[] num = {2,6,8};

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int ans = 0;
            for(int i=n; i>=0; i--){
                if(p[i]==0) continue;
                boolean boo = true;
                for(int j=0; j<3; j++){
                    if(p[i-num[j]]==0){
                        boo = false;
                        break;
                    }
                }
                if(boo){
                    ans = i;
                    break;
                }
            }
            
            System.out.println(ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}