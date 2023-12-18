import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    static final int MAX = (int)1e5+5;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        
        boolean[][] s = new boolean[h][w];
        for(int i=0; i<h; i++){
            String line = sc.next();
            for(int j=0; j<w; j++){
                s[i][j] = line.charAt(j)=='.';
            }
        }
        
        int max = -1;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int[][] dist = new int[h][w];
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(!s[i][j]){
                    continue;
                }
                
                q.addFirst(i*w+j);
                for(int[] d : dist){
                    Arrays.fill(d, MAX);
                }
                dist[i][j] = 0;
                while(q.size()!=0){
                    int now = q.pollLast();
                    int x = now%w;
                    int y = now/w;
                    int nowdist = dist[y][x];
                    if(y+1<h && s[y+1][x] && dist[y+1][x]>nowdist+1){
                        q.add((y+1)*w+x);
                        dist[y+1][x] = nowdist+1;
                    }
                    if(y-1>=0 && s[y-1][x] && dist[y-1][x]>nowdist+1){
                        q.add((y-1)*w+x);
                        dist[y-1][x] = nowdist+1;
                    }
                    if(x+1<w && s[y][x+1] && dist[y][x+1]>nowdist+1){
                        q.add(y*w+x+1);
                        dist[y][x+1] = nowdist+1;
                    }
                    if(x-1>=0 && s[y][x-1] && dist[y][x-1]>nowdist+1){
                        q.add(y*w+x-1);
                        dist[y][x-1] = nowdist+1;
                    }
                }
                
                for(int y=0; y<h; y++){
                    for(int x=0; x<w; x++){
                        if(max < dist[y][x] && s[y][x]){
                            max = dist[y][x];
                        }
                    }
                }
            }
        }
        
        System.out.println(max);
    }
}
