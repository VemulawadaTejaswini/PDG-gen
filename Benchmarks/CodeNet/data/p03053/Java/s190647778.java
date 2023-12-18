import java.util.*;

public class Main{
    
    public static final int INF = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        int[][] dist = new int[h][w];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        
        for(int i=0; i<h; i++){
            char[] s = sc.next().toCharArray();
            for(int j=0; j<w; j++){
                if(s[j]=='#'){
                    dist[i][j] = 0;
                    q.addLast(i*w+j);
                }else{
                    dist[i][j] = INF;
                }
            }
        }
        
        int ans = 0;
        while(q.size()!=0){
            int now = q.removeFirst();
            int y = now/w;
            int x = now%w;
            ans = Math.max(ans, dist[y][x]);
            if(y+1<h && dist[y+1][x]>dist[y][x]+1){
                dist[y+1][x] = dist[y][x]+1;
                q.addLast((y+1)*w+x);
            }
            if(0<=y-1 && dist[y-1][x]>dist[y][x]+1){
                dist[y-1][x] = dist[y][x]+1;
                q.addLast((y-1)*w+x);
            }
            if(x+1<w && dist[y][x+1]>dist[y][x]+1){
                dist[y][x+1] = dist[y][x]+1;
                q.addLast(y*w+x+1);
            }
            if(0<=x-1 && dist[y][x-1]>dist[y][x]+1){
                dist[y][x-1] = dist[y][x]+1;
                q.addLast(y*w+x-1);
            }
        }
        
        System.out.println(ans);
    }
}
