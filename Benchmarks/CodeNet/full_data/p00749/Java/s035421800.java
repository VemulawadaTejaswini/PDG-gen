import java.util.*;
import java.awt.Point;
import java.beans.Visibility;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
    static int w, h;
    static char[][] t;

    static boolean result;

    static class State {
        double xx;
        int cnt;
        int id;

        State(int id, double xx, int cnt) {
            this.id = id;
            this.xx = xx;
            this.cnt = cnt;
        }

        public boolean equals(Object o) {
            State st = (State) o;
            return id == st.id;
        }

        public int hashCode() {
            return id;
        }
    }

    static int id;

    static boolean[][] reced;
//    static State[][] visited;

    static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { -1, 0, 1, 0 };

    static void rec2(int x, int y, int[] cnts, ArrayList<Integer> mm, Set<State> ret_ue, boolean init){
        char c = t[y][x];

        if(reced[y][x]) return ;
        reced[y][x] = true;

        if(!result) return;
        if(y==h-1 || t[y+1][x] != '.' && t[y+1][x] !=c){
            if(x < mm.get(0)){
                mm.set(0, x);
            }
            if(x+1 > mm.get(1)){
                mm.set(1, x+1);
            }
        }


        cnts[x]++;
        //out.println("x:"+x +" y:"+y);

        for(int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || nx >= w || ny < 0 || ny >= h) continue;
            if(t[ny][nx] == '.') continue;
            if(t[ny][nx] != c) continue;
            rec2(nx, ny, cnts, mm, ret_ue, false);
        }

//        Set<State> ue = new HashSet<State>();

        int nx = x + dx[0];
        int ny = y + dy[0];
        if(!(nx < 0 || nx >= w || ny < 0 || ny >= h)) {
            if(t[ny][nx] !='.' && t[ny][nx] != c){
                int[] cnts2 = new int[w];
                ArrayList<Integer> mm2 = new ArrayList<Integer>();
                mm2.add(x);
                mm2.add(x+1);
                HashSet<State> call_ue = new HashSet<State>();
                rec2(nx, ny, cnts2, mm2, call_ue, true);
                ret_ue.addAll(call_ue);
            }
        }

        if(init){
            // STABLEツ板サツ津ィ
            double g = 0;
            int tmp = 0;

            double mg = 0;
            int mytmp = 0;
//            out.println(Arrays.toString(cnts));
            for(int i=0;i<w;i++){
                g += (i+0.5)*cnts[i];
                tmp += cnts[i];
                mg += (i+0.5)*cnts[i];
                mytmp += cnts[i];
            }

            for(State st : ret_ue){
                g+=(st.xx * st.cnt);
                tmp += st.cnt;
            }
            g = g / tmp;
            if(!(mm.get(0)< g && g < mm.get(1))){
                result = false;
//                out.println("false");
            }
            mg = mg / mytmp;
            //out.println("g="+g+" tmp="+tmp+" mg="+mg+" mytmp="+mytmp + " ret_size="+ret_ue.size());

            // ueツづーツ更ツ新
            State st = new State(id++, mg, mytmp);
            ret_ue.add(st);
        }
    }
    //static void rec2(int x, int y, int[] cnts, ArrayList<Integer> mm, Set<State> ret_ue, boolean init){

    static void solve() {
        result = true;
        id = 0;
        for (int i = 0; i < w; i++) {
            if(t[h-1][i]=='.')continue;

            ArrayList<Integer> mm = new ArrayList<Integer>();
            mm.add(i);
            mm.add(i+1);
            rec2(i, h - 1, new int[w], mm, new HashSet<State>(), true);
        }
        if (result) {
            out.println("STABLE");
        } else {
            out.println("UNSTABLE");
        }
////        if (visited[y][x] != null)
////            return visited[y][x];
//
//        char c = t[y][x];
//
//        int[] cnts = new int[w];
//        Set<State> ue = new HashSet<State>();
//        rec2(x, y, cnts, ue);
//
//        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String[] sa = sc.nextLine().split(" ");
            w = new Integer(sa[0]);
            h = new Integer(sa[1]);
            if (w == 0 && h == 0)
                break;

            t = new char[h][w];
            reced = new boolean[h][w];
//            visited = new State[h][w];
            for (int i = 0; i < h; i++) {
                t[i] = sc.nextLine().toCharArray();
            }
            solve();
        }
    }
}