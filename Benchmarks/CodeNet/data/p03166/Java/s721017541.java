import java.util.*;
import java.io.*;
import java.lang.*;

 class Main{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder("");
    static StringTokenizer stk = new StringTokenizer("");
    static Map<Integer,ArrayList<Integer>> adjList = new HashMap<>();
    static int[] dp ;
    static int N = 0;
    static int M = 0;
    static int maxValue = 0;

    public static  void main(String args[]){
        try{
            stk = new StringTokenizer(bf.readLine());
             N = Integer.parseInt(stk.nextToken());
             M = Integer.parseInt(stk.nextToken());
             dp =  new int[N+1];

            for(int i=0;i<M;i++){
                stk = new StringTokenizer(bf.readLine());
                int from = Integer.parseInt(stk.nextToken());
                int to = Integer.parseInt(stk.nextToken());

                if(adjList.containsKey(from)){
                    adjList.get(from).add(to);
                }else{
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(to);
                    adjList.put(from,al);
                }
            }

            for(int i=0;i<=N;i++)
                dp[i] = -1;

            solver();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void solver(){
        
        for(int i=1;i<=N;i++){
            if(dp[i] == -1)
                maxValue = Math.max(maxValue , dfs(i));
            else
                maxValue = Math.max(maxValue,dp[i]);
        }

        // for(int i=1;i<=N;i++){
        //     System.out.print(dp[i]+"  ");
        // }

        System.out.println(maxValue);
    }


    public static int dfs(int src ){

        if(adjList.get(src) == null || adjList.get(src).size() == 0){
            return 0;
        }

        //check where things are starting 
       
        for(int i=0;i < adjList.get(src).size();i++){
            
            if(dp[adjList.get(src).get(i)] > -1)
                dp[src] = Math.max(dp[src], 1+ dp[adjList.get(src).get(i)]) ;
            else
                dp[src] =  Math.max(dp[src],1 + dfs(adjList.get(src).get(i))); //maxlength

        }

        return dp[src];   

    }

}