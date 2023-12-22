import java.io.*;
import java.util.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String[] ia; 

                while(true){
                        ia = in.readLine().split("[ \t]");
                        int x = Integer.parseInt(ia[0]);
                        int y = Integer.parseInt(ia[1]);
                        if(x == 0 && y == 0){ 
                                break;
                        }   
                        l = new boolean[x][x];
                        v = new int[y][2];
                        ia = in.readLine().split("[ \t]");
                        for(int i = 0;i < y; ++i){
                                int a,b;
                                v[i][0] = a = Integer.parseInt(ia[2*i]);
                                v[i][1] = b = Integer.parseInt(ia[2*i+1]);
                                l[a][b] = l[b][a] = true;
                        }   
                        r = new boolean[x];
                        s = new boolean[y];
                        w = new boolean[x];
                        int c;
                        for(c = 1;c <= x; ++c){
                                Arrays.fill(r,true); 
                                Arrays.fill(s,true); 
                                Arrays.fill(w,true); 
                                if(solve(c)){
                                        break;
                                }   
                        }   
                        System.out.println(c);
                }   
        }
        static int[][] v;
        static boolean[][] l;
        static boolean[] r,s,w;
        static boolean solve(int c){ 
                if(c == 0){ 
                        return check(s) && check(w);
                }
                for(int i = 0;i < r.length; ++i){
                        if(r[i]){
                                boolean[] t = r.clone();
                                boolean[] u = s.clone();
                                r[i] = false;
                                w[i] = false;
                                for(int j = 0;j < l[i].length; ++j){
                                        if(l[i][j]){
                                                for(int k = 0;k < v.length; ++k){
                                                        if((v[k][0] == i && v[k][1] == j)
                                                        || (v[k][1] == i && v[k][0] == j)){
                                                                s[k] = false;
                                                        }
                                                }
                                                w[j] = false;
                                        }
                                }
                                if(solve(c-1)){
                                        return true;
                                }
                                r = t;
                                s = u;
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