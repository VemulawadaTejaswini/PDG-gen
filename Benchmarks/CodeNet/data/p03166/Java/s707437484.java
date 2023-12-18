import java.util.*;
import java.io.*;
import java.lang.*;

 class Main{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder("");
    static StringTokenizer stk = new StringTokenizer("");
    // static long[][] dp ;
    static Map<Integer,ArrayList<Integer>> adjList = new HashMap<>();
    static int N = 0;
    static int M = 0;
    static long maxValue = 0;

    public static  void main(String args[]){
        try{
            stk = new StringTokenizer(bf.readLine());
             N = Integer.parseInt(stk.nextToken());
             M = Integer.parseInt(stk.nextToken());
            //  dp =  new long[N+1][N+1];

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

            solver();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void solver(){
        for(int i=1;i<=N;i++){
            dfs(i,i,1);
            // System.out.println("doing dfs from "+i+" value "+maxValue);
            // printMatrix()
        }
        System.out.println(maxValue);
    }

    public static void printMatrix(){
        for(int k=1;k<=N;k++){
                for(int j=1;j<=N;j++){
                    System.out.print(dp[k][j]+" ");                
                }
                System.out.println("");
            }
    }

    public static void dfs(int src, int origin ,long length){
        if(adjList.get(src) == null || adjList.get(src).size() == 0){
            return ;
        }

        //check where things are starting 
        for(int i=0;i < adjList.get(src).size();i++){
            // dp[src][adjList.get(src).get(i)] = Math.max(dp[src][adjList.get(src).get(i)],1);
            // dp[origin][adjList.get(src).get(i)] = Math.max(dp[origin][adjList.get(src).get(i)] , length );
            maxValue = Math.max(maxValue , length]);
            dfs(adjList.get(src).get(i),origin,length+1);
        }   
    }

}