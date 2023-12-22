import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    TreeSet<Integer>[] hori_obs, hori_blank, verti_obs, verti_blank;
    int H,W,K;
    int[][] dist;
    int x2,y2;
    int step = 1;
    public static void main(String[] args) throws IOException {
        Main main = new Main();

//        main.solve();
        long ans = main.solve();
        out.println(ans);
        out.flush();
    }
    long solve() throws IOException {
        String[] buf = reader.readLine().split(" ");
        H = paIn(buf[0]); W = paIn(buf[1]); K = paIn(buf[2]);
        buf = reader.readLine().split(" ");
        int x1 = paIn(buf[0])-1, y1 = paIn(buf[1])-1; x2 = paIn(buf[2])-1; y2 = paIn(buf[3])-1;
        hori_blank = new TreeSet[H]; hori_obs = new TreeSet[H];
        for(int i=0; i<H; i++){
            hori_obs[i] = new TreeSet<>(); hori_blank[i] = new TreeSet<>();
            hori_obs[i].add(-1); hori_obs[i].add(W);
        }
        verti_blank = new TreeSet[W]; verti_obs = new TreeSet[W];
        for(int j=0; j<W;j++){
            verti_blank[j] = new TreeSet<>(); verti_obs[j] = new TreeSet<>();
            verti_obs[j].add(-1); verti_obs[j].add(H);
        }
        for(int i=0; i<H; i++){
            char[] s = reader.readLine().toCharArray();
            for(int j=0; j<W; j++){
                if(s[j]=='.'){
                    hori_blank[i].add(j); verti_blank[j].add(i);
                } else{
                    hori_obs[i].add(j); verti_obs[j].add(i);
                }
            }
        }
        dist = new int[H][W];
        int inf = Integer.MAX_VALUE/10;
        for(int[] arr:dist) Arrays.fill(arr, inf);
        dist[x1][y1] = 0;
        List<Integer> cur = new LinkedList<>(), next = new LinkedList<>();

        cur.add(x1*W+y1);
        while(cur.size()>0){
            for(int now:cur){
                int r = now/W, c = now%W;
                if(r==x2&&c==y2) return dist[r][c];
                // look up
                int uplim = verti_obs[c].lower(r);
                if(uplim<r-1){
                    uplim = Math.max(uplim+1, r-K);
                    int temp = helper(r,c,uplim,r-1,verti_blank[c],true,next);
                    if(temp>=0) return step;
                }
                // look down
                int lolim = verti_obs[c].higher(r);
                if(lolim>r+1){
                    lolim = Math.min(lolim-1, r+K);
                    int temp = helper(r,c,r+1,lolim,verti_blank[c],true,next);
                    if(temp>=0) return step;
                }
                // look left
                int leftlim = hori_obs[r].lower(c);
                if(leftlim<c-1){
                    leftlim = Math.max(leftlim+1, c-K);
                    int temp = helper(r,c, leftlim,c-1,hori_blank[r],false,next);
                    if(temp>=0) return step;
                }
                // look right
                int rightlim = hori_obs[r].higher(c);
                if(rightlim>c+1){
                    rightlim = Math.min(rightlim-1, c+K);
                    int temp = helper(r,c,c+1,rightlim,hori_blank[r],false,next);
                    if(temp>=0) return step;
                }
            }
            cur = next; next = new LinkedList<>(); step++;
        }
        return -1;
    }
    int helper(int r, int c, int lo, int hi, TreeSet<Integer> blank, boolean isVerti, List<Integer> next){
        NavigableSet<Integer> set = blank.subSet(lo, true, hi, true);
        List<Integer> temp = new LinkedList<>(set);
        for(int i:temp) blank.remove(i);
        if(isVerti){
            for(int i:temp){
                if(dist[i][c]>step){
                    if(i==x2&&c==y2) return step;
                    dist[i][c] = step;
                    next.add(i*W+c);
                }
            }
        } else{
            for(int j:temp){
                if(dist[r][j]>step){
                    if(r==x2&&j==y2) return step;
                    dist[r][j] = step;
                    next.add(r*W+j);
                }
            }
        }
        return -1;
    }
    int paIn(String s){return Integer.parseInt(s);}
}