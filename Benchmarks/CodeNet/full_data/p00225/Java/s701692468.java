import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n!=0){
            String[] list = new String[n];
            for(int i=0; i<n; i++) list[i] = sc.next();

            int INF = Integer.MAX_VALUE;
            int[][] dist = new int[n][n];
            for(int i=0; i<n; i++) Arrays.fill(dist[i], INF/10);
            for(int i=0; i<n; i++){
                char last = list[i].charAt(list[i].length()-1);
                for(int j=0; j<n; j++){
                    char first = list[j].charAt(0);
                    if(last==first) dist[i][j] = 1;
                }
            }
            
            for(int k = 0; k < n; ++k)
                for(int i = 0; i < n; ++i)
                    for(int j = 0; j < n; ++j) dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);

            boolean boo = false;
            for(int start=0; start<n; start++){
                for(int goal=0; goal<n; goal++){
                    if(dist[start][goal]==n-1 && dist[goal][start]==1) boo = true;
                }
            }
            if(boo) System.out.println("OK");
            else System.out.println("NG");
            n = sc.nextInt();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}