import java.util.*;

class Main{

    int w, h;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt(); h = sc.nextInt();
            if(w==0 && h==0) break;
            System.out.println(bfs());
        }
    }

    int[] dx = {1, 0};
    int[] dy = {0, 1};

    int bfs(){
        LinkedList<int[]> list = new LinkedList<int[]>();
        list.add(new int[]{1, 1, -1, -1});

        int cnt = 0;
        while(list.size()>0){
            int[] q = list.poll();
            int x = q[0], y = q[1], turn = q[2], before = q[3];
            //System.out.println("x: "+x+" y: "+y+" turn "+turn+" before "+before);


            if(x==w && y==h) {cnt = (cnt + 1) % 100000; continue;}

            for(int i=0; i<2; i++){
                int nx = x + dx[i], ny = y + dy[i];
                if(nx<1 || nx>w || ny<1 || ny>h) continue;
                if(turn==1 && before!=i) continue;
                int nturn = 0;
                if(before!=-1 && before!=i) nturn = 1;
                list.add(new int[]{nx, ny, nturn, i});
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}