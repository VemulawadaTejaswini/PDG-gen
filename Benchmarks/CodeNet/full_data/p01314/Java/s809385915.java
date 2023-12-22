import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int cnt = 0;
            for(int i=1; i<n; i++){
                int sum = 0;
                for(int j=i; j<n; j++){
                    sum += j;
                    if(sum==n) cnt++;
                    if(sum>=n) break;
                }
            }

            System.out.println(cnt);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}