
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by jaga on 9/7/16.
 * 貪欲法で調べていく。が、全地点に関してそれをやると部分点解法だと思われる
 * dpで、ある地点からある地点にかかる日数を調べておく
 * dp[j][k] = j番目の地点からk番目の地点にかかる日数 INFで初期化 j <= k
 * dp[j][k] = Min(dp[j][k-1], dp[j][k-2], ,,, dp[j][k -10]) + 1;
 * 距離がLまでの以前の地点のうち、もっとも日数がかからない地点に+1した値
 * 貪欲法で考えるなら一番遠くの値
 * ただし、k - x >=j に注意しておく
 * これだとループを回す回数は 最大N ^ 2のオーダー
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  N,L, Q;
        int INF = 100000000;
        int x[], a[], b[];

        String line = br.readLine();
        N = Integer.parseInt(line);

        line = br.readLine();
        String text[] = line.split(" ");
        x = new int[N];
        for(int i = 0; i < N ; i++){
            x[i] = Integer.parseInt(text[i]);
        }

        line = br.readLine();
        L  = Integer.parseInt(line);

        line = br.readLine();
        Q = Integer.parseInt(line);

        a = new int[Q];b = new int[Q];
        int aa,bb;
        for(int i = 0; i < Q; i++){
            line = br.readLine();
            text = line.split(" ");
            aa = Integer.parseInt(text[0]);
            bb = Integer.parseInt(text[1]);
            a[i] = Math.min(aa,bb) - 1;
            b[i] = Math.max(aa,bb) - 1;
        }

        int dp[][] = new int[N][N];
        for(int i = 0; i < N;i++){
            Arrays.fill(dp[i], INF);
        }


        for(int i = 0; i < N ;i++){
            //自分から自分の距離は0
            dp[i][i] = 0;
        }

        //現在使用できる最も遠い地点を保管する
        PriorityQueue<Integer > que = new PriorityQueue<Integer>();

        loop:for(int i  =0 ; i < N ; i++){
            //出発点の座標
            int from = x[i];
            que.clear();
            que.add(i);

            for(int k = i + 1; k < N ; k++){
                int to = x[k];

                while(true){
                    //一番遠い地点がL圏内にくるまでpoll
                    if(to - x[que.peek()] > L){
                        que.poll();
                    }else{
                        break;
                    }
                }
                if(que.isEmpty())System.out.println("error");
                dp[i][k] =  dp[i][que.peek()] + 1;
                que.add(k);
            }
        }

        for(int i = 0; i < Q; i++){
            System.out.println(dp[a[i]][b[i]]);
        }
    }
}
