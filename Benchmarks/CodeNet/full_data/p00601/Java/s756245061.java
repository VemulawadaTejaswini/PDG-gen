import java.io.*;
import java.util.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is;
                String[] ia;

                while(true){
                        ia = in.readLine().split("[ \t]");
                        int x = Integer.parseInt(ia[0]);
                        int y = Integer.parseInt(ia[1]);
                        if(x == 0 && y == 0){
                                break;
                        }
                        boolean[][] l = new boolean[x][x];
                        ia = in.readLine().split(" ");
                        for(int i = 0;i < y; ++i){
                                int a,b;
                                a = Integer.parseInt(ia[2*i]);
                                b = Integer.parseInt(ia[2*i+1]);
                                l[a][b] = l[b][a] = true;
                        }
                        boolean solved = false;
                        boolean[] r = new boolean[x];
                        int c = 0;
                        while(!solved){
                                Arrays.fill(r,true);
                                ++c;
                                solved = solve(l,r,c);
                        }
                        System.out.println(c);
                }
        }
        static boolean solve(boolean[][] l, boolean[] r, int c){
                if(c == 0){
                        return check(r);
                }
                for(int i = 0;i < r.length; ++i){
                        if(r[i]){
                                boolean[] s = r.clone();
                                r[i] = false;
                                for(int j = 0;j < l[i].length; ++j){
                                        if(l[i][j]){
                                                r[j] = false;
                                        }
                                }
                                if(solve(l,r,c-1)){
                                        return true;
                                }
                                r = s;
                        }
                }
                return false;
        }
        static boolean check(boolean[] r){
                for(int i = 0;i < r.length; ++i){
                        if(r[i]){
                                return false;
                        }
                }
                return true;
        }
}