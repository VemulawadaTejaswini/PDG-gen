import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

class graphDP{

    int v;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    graphDP(int x){

        v = x;
        for(int i=0;i<=v;i++){

            ArrayList<Integer> z = new ArrayList<>();
            adj.add(z);
        }

    }

    void add(int x , int y){
        adj.get(x).add(y);
    }

    void dfs(int x , int[] dp , boolean[] visited){


        visited[x] = true;
        for(int ver=0; ver<adj.get(x).size();ver++){
            int t= adj.get(x).get(ver);
            if(!visited[t]){

                dfs(t,dp,visited);

            }

            dp[x] = Math.max(dp[x],1+dp[t]);
        }




    }


}


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        graphDP g = new graphDP(n);
        boolean[] visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {

            int start = in.nextInt();
            int end = in.nextInt();
            g.add(start,end);
        }

        int[] dp = new int[n+1];

        for(int i=1;i<=n;i++){

            if(!visited[i]){

                g.dfs(i,dp,visited);

            }

        }

//        for(int i=0;i<dp.length;i++) {
//
//            System.out.println(dp[i] + " ");
//        }
//            System.out.println();

        int max = dp[0];
        for(int i=1;i<dp.length;i++){

            if(max<dp[i]) max = dp[i];
        }


        System.out.println(max);

    }
}
