import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] map = new char[n][];
        for(int i = 0; i < n; i++){
            map[i] = sc.next().toCharArray();
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                for(int k = i; k < n; k++){
                    for(int l = 0; l < m; l++){
                        if(i == k && j == l){
                            continue;
                        }
                        Boolean[] bool = new Boolean[n*m];
                        Arrays.fill(bool,false);
                        if(map[i][j] == '.' && map[k][l] == '.'){
                            ans = Math.max(ans,dfs(n,m,map,i,j,k,l,0,bool));
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int dfs(int n, int m, char[][]map,int sy,int sx,int gy, int gx, int cnt,Boolean[] bool){
        int[] mx = {1,0,-1,0};
        int[] my = {0,1,0,-1};
        if(sy == gy && sx == gx){
            return cnt;
        }
        int ret = 100000000;
        for(int i = 0; i < 4; i++){
            int y = sy+my[i];
            int x = sx+mx[i];
            if(!(0 <= y && y < n && 0 <= x && x < m)){
                continue;
            }else if(map[y][x] == '#' || bool[y*m+x]){
                continue;
            }
            bool[y*m+x] = true;
            ret = Math.min(ret,dfs(n,m,map,sy+my[i],sx+mx[i],gy,gx,cnt+1,bool));
            bool[y*m+x] = false;
        }
        return ret;
    }
}