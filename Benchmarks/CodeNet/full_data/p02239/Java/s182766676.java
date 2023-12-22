import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Edge[][] = new int[n][n];
        for(int i=0;i<n;i++){
            int v = sc.nextInt();
            int k= sc.nextInt();
            Arrays.fill(Edge[v-1],0);
            for(int j=0;j<k;j++){
                int num = sc.nextInt();
                Edge[v-1][num-1]=1;
            }
        }
        int D[] = new int[n];
        Arrays.fill(D,-1);
        D[0] = 0;
        BFS(Edge,D,0);
        for(int i=0;i<n;i++) System.out.println(i+1+" "+D[i]);
    }
    public static void BFS(int [][] E,int D[],int v){
        Deque<Integer> L = new ArrayDeque<>();
        L.add(v);
        while(L.size()!=0){
            int v2 = L.poll();
            int d = D[v2];
            for(int i=0;i<E[v2].length;i++){
                if(D[i]==-1&&E[v2][i]==1){
                    L.add(i);
                    D[i] = d+1;
                }
            }
        }
    }
}
