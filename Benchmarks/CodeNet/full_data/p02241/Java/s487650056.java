import java.util.*;

class Main{
    static boolean fin(boolean[] searched){
        for(boolean b : searched){
            if(b==false) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=sc.nextInt();
            }    
        }

        int cost = 0;
        boolean[] searched = new boolean[n];
        for(boolean b : searched) b = false;
        searched[0] = true;

        while(!fin(searched)){
            int nextNode = -1;
            int minCost = Integer.MAX_VALUE;

            for(int i=0; i<n; i++){
                if(!searched[i]){
                    for(int j=0; j<n; j++){
                        if(graph[i][j]<minCost && graph[i][j]!=-1 && searched[j] ){
                            nextNode = i;
                            minCost = graph[i][j];
                        }
                    }
                }
            }
            searched[nextNode] = true;
            cost+=minCost;
        }
        System.out.println(cost);
    }
}
