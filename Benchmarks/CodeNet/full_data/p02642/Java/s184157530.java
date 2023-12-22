import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        final int Amax = (int)1e6;

        int baisuu[] = new int[Amax + 1];
        Arrays.fill(baisuu,0);

        int presentBaisuu[] = new int[n];

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            presentBaisuu[i] = x;

            //同じ数を弾く処理
            if(baisuu[x] >= 1){
                baisuu[x]++;
                continue;
            }

            //0番目のindexは使わない
            for(int j = 1; j <= Amax / x; j++){
                baisuu[j * x]++;
            }
        }

        int ans = 0;
        for(int k = 0; k < n; k++){
            if(baisuu[presentBaisuu[k]] == 1){
                ans++;
            }
        }

        System.out.println(ans);

    }
}

