import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] mp = new int[H][];
        for(int i=0;i<H;i++){
            String s = sc.next();
            mp[i] = new int[W];
            char[] sca = s.toCharArray();
            for(int j=0;j<W;j++)
                mp[i][j] = sca[j] == '#' ? 1 : 0;
        }

        int[] roots = new int[10000];
        for(int i=0;i<10000;i++){
            roots[i] = i;
        }
        for(int y=0;y<H;y++){
            for(int x=0;x<W;x++){
                if(mp[y][x] == 0){continue;}
                if(x+1 < W && mp[y][x] == mp[y][x+1]){
                    myUnion(key(y,x), key(y,x+1), roots);
                }
                if(y+1 < H && mp[y][x] == mp[y+1][x]){
                    myUnion(key(y,x), key(y+1,x), roots);
                }
            }
        }

        int[][] flipcnt = new int[H+1][];
        for(int i=0;i<H+1;i++) {
            flipcnt[i] = new int[W + 1];
            Arrays.fill(flipcnt[i], 20000);
        }
        for(int i=0;i<H+1;i++)
            flipcnt[i][0] = 0;
        for(int j=0;j<W+1;j++)
            flipcnt[0][j] = 0;
        if(mp[0][0] == 1)
            flipcnt[1][1] = 1;
        else
            flipcnt[1][1] = 0;

        for(int y=1;y<=H;y++){
            for(int x=1;x<=W;x++){
                int yi=y-1;
                int xi=x-1;
                if(mp[yi][xi] == 1){ // if black..
                    for(int ty=0;ty<=yi;ty++){
                        for(int tx=0;tx<=xi;tx++){
                            if(!canReach(xi,yi, tx,ty, roots)){continue;}
                            //System.out.println("can reach from " + xi + "," + yi + " to:" + tx + "," + ty);
                                flipcnt[y][x] = Math.min(flipcnt[y][x], flipcnt[ty][tx+1]+1);
                                flipcnt[y][x] = Math.min(flipcnt[y][x], flipcnt[ty+1][tx]+1);
                        }
                    }
                }else{
                    if(yi > 0){//上OK
                        flipcnt[y][x] = Math.min(flipcnt[y][x], flipcnt[y-1][x]);
                    }
                    if(xi > 0){//左OK
                        flipcnt[y][x] = Math.min(flipcnt[y][x], flipcnt[y][x-1]);
                    }
                }
            }
        }
        /*for(int y=0;y<H+1;y++){
            for(int x=0;x<W+1;x++) {
                System.out.print(flipcnt[y][x]);
            }
            System.out.println();
        }*/
        System.out.println(flipcnt[H][W]);

    }


    private static boolean canReach(int xi, int yi, int x, int y, int[] roots){
        return myFind(key(yi, xi), roots) == myFind(key(y, x), roots);
    }


    private static void myUnion(int a, int b, int[] roots) {
        int ar = myFind(a, roots);
        int br = myFind(b, roots);
        roots[br] = ar;
    }

    private static int myFind(int x, int[] roots){
        List<Integer> ch = new ArrayList<>();
        while(x != roots[x]){
            ch.add(x);
            x = roots[x];
        }
        for(int r:ch){
            roots[r] = x;
        }
        return x;
    }

    private static int key(int h, int w){
        return h*100+w;
    }
}
