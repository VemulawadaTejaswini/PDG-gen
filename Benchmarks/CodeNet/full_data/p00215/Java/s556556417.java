import java.util.*;

@SuppressWarnings("unchecked")
class Main{

    int w, h;
    //char[][] map;
    ArrayList[] list;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt(); h = sc.nextInt();
            if(w==0 && h==0) break;

            list = new ArrayList[5];
            for(int i=0; i<5; i++) list[i] = new ArrayList<int[]>();

            int sx = 0, sy = 0;
            int gx = 0, gy = 0;
            for(int i=0; i<h; i++){
                char[] line = sc.next().toCharArray();
                for(int j=0; j<w; j++){
                    if(line[j]=='S'){ sx = j; sy = i;}
                    if(line[j]=='G'){ gx = j; gy = i;}
                    if(Character.isDigit(line[j])) list[line[j]-'1'].add(new int[]{j, i});
                }
            }

            int idx = 0, min = Integer.MAX_VALUE;
            for(int i=0; i<5; i++){
                int num = bfs(sx, sy, gx, gy, i);
                if(num==-1) continue;
                if(num<min){
                    min = num;
                    idx = i;
                }
            }
            idx++;
            if(min==Integer.MAX_VALUE) System.out.println("NA");
            else System.out.println(idx+" "+min);
            System.gc();
        }
    }

    int bfs(int sx, int sy, int gx, int gy, int pati){
        //pos, nextpati, dist
        PriorityQueue<int[]> q = new PriorityQueue<int[]>(10, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return a[3] - b[3];
                }
            });
        q.add(new int[]{sx, sy, (pati+1)%5, 0});

        while(q.size()>0){
            int[] qq = q.poll();
            int x = qq[0], y = qq[1], nextpati = qq[2], dist = qq[3];

            if(nextpati==pati) return dist;

            for(int i=0; i<list[nextpati].size(); i++){
                int[] qqq = (int[])list[nextpati].get(i);
                int nx = qqq[0], ny = qqq[1];
                int ndist = dist+Math.abs(x-nx)+Math.abs(y-ny);
                if((nextpati+1)%5==pati) ndist += Math.abs(nx-gx)+Math.abs(ny-gy);
                q.add(new int[]{nx, ny, (nextpati+1)%5, ndist});
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}