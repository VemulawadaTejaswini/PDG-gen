import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Edge[][] = new int[N+1][N+1];
        int Edge2[][] = new int[N+1][N+1];
        int DP [] = new int[N];
        Arrays.fill(DP,0);
        for(int i=0;i<N+1;i++){
            Arrays.fill(Edge[i],0);
            Arrays.fill(Edge2[i],0);
        }
        int opt [] = new int[N];
        int opt_num = 0;
        Queue<Integer> L = new ArrayDeque<>();
        for(int i=0;i<M;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            Edge[x][y]=1;
            Edge2[x][y]=1;
        }
        //トポロジカルソート
        for(int i=1;i<N+1;i++){
            boolean check = true;
            for(int j=1;j<N+1;j++) {
                if (Edge[j][i] == 1) {
                    check = false;
                    break;
                }
            }
            if(check)L.add(i);
        }
        while(L.size()!=0) {
            int num = L.poll();
            opt[opt_num] = num;
            opt_num++;
            for (int i = 1; i < N + 1; i++) {
                if (Edge[num][i] == 1){
                    Edge[num][i] = 0;
                    boolean check = true;
                    for (int j = 1; j < N + 1; j++) {
                        if (Edge[j][i] == 1) {
                            check = false;
                            break;
                        }
                    }
                    if (check) L.add(i);
                }
            }
        }
        DP[0]=0;
        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                if(Edge2[opt[j]][opt[i]]==1){
                    DP[i] = Math.max(DP[i],DP[j]+1);
                }
            }
        }
        System.out.println(DP[N-1]);
    }
}