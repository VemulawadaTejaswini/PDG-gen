import java.util.*;

public class Main {
    private static int H, W;
    private static int Sx, Sy, Ex, Ey;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        Sy = sc.nextInt()-1;
        Sx = sc.nextInt()-1;
        Ey = sc.nextInt()-1;
        Ex = sc.nextInt()-1;
        int[][] mp = new int[H][W];
        int[] group = new int[H*W];
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for(int y=0;y<H;y++){
            String line = sc.next();
            for(int x=0;x<W;x++){
                mp[y][x] = (line.charAt(x) == '.') ? 0 : 1;
                group[y*W+x] = y*W+x;
            }
        }
        //showMap(group);
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingInt(p->p.cnt));
        Set<Integer> visited = new HashSet<>();
        pq.add(new State(Sx,Sy,0));
        while(!pq.isEmpty()){
            State now = pq.poll();
            visited.add(now.y*W+now.x);
            if(now.x == Ex && now.y == Ey){
                System.out.println(now.cnt);
                return;
            }
            for(int d=0;d<4;d++){
                int tx=now.x+dx[d];
                int ty=now.y+dy[d];
                if(tx < 0 || tx >= W || ty < 0 || ty >= H){continue;}
                if(visited.contains(ty*W+tx)){continue;}
                if(mp[ty][tx] == 1){continue;}
                pq.add(new State(tx,ty,now.cnt));
            }
            for(int y=-2;y<=2;y++){
                for(int x=-2;x<=2;x++){
                    int ty=now.y+y;
                    int tx=now.x+x;
                    if(tx < 0 || tx >= W || ty < 0 || ty >= H){continue;}
                    if(visited.contains(ty*W+tx)){continue;}
                    if(mp[ty][tx] == 1){continue;}
                    pq.add(new State(tx, ty, now.cnt+1));
                }
            }
        }
        System.out.println(-1);
        return;


    }

    private static void showMap(int[][] m){
        for(int y=0;y<H;y++){
            for(int x=0;x<W;x++){
                System.out.print(m[y][x]);
            }
            System.out.println();
        }
    }

    private static class State{
        int x, y;
        int cnt;
        public State(int x, int y, int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }
}
