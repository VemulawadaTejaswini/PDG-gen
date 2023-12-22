import java.util.*;

public class Main2{

    int n;
    int max = 1<<15;

    void solve(){
        Scanner sc = new Scanner(System.in);

        int[] cnt = new int[max+1];
        for(int i=1; i*i<=max; i++){
            cnt[i*i]++;
            for(int j=i; j*j+i*i<=max; j++){
                cnt[i*i+j*j]++;
                for(int k=j; k*k+j*j+i*i<=max; k++){
                    cnt[i*i+j*j+k*k]++;
                    for(int l=k; l*l+k*k+j*j+i*i<=max; l++){
                        cnt[i*i+j*j+k*k+l*l]++;
                    }
                }
            }
        }

        while(true){
            n = sc.nextInt();
            if(n==0) break;
            System.out.println(cnt[n]);
        }
    }

    public static void main(String[] args){
        new Main2().solve();
    }
}