import java.io.*;
import java.util.Arrays;
public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is; 
                String ia[];
                while((is = in.readLine()) != null){
                        int l = 7;
                        int n = Integer.parseInt(is);
                        boolean[][] p = new boolean[l][l];
                        for(int i = 0;i < l; ++i){
                                Arrays.fill(p[i],false);
                        }   
                        ia = in.readLine().split(" ");
                        int[] s = new int[n];
                        for(int i = 0;i < n; ++i){
                                s[i] = Integer.parseInt(ia[i]);
                                p[s[i]%10][(int)(Math.floor(s[i]/10))] = true;
                        }   
                        boolean yet = true;
                        for(int i = 0;i < n; ++i){
                                if(mfs(p, l, s[i]%10, (int)(Math.floor(s[i]/10)))){
                                        System.out.println("Yes");
                                        yet = false;
                                        break;
                                }   
                        }   
                        if(yet){
                                System.out.println("No");
                        }   
                }   
        }
        static boolean mfs(boolean[][] p, int n, int x, int y){ 
                if(x < 0 || n <= x || y < 0 || n <= y){ 
                        return false;
                }   
                if(p[x][y] == false){
                        return false;
                }   
                p[x][y] = false;
                if(!chk(p,n)){
                        return true;
                }   
                boolean a = 
                        mfs(p,n,x-1,y) ||
                        mfs(p,n,x+1,y) ||
                        mfs(p,n,x,y-1) ||
                        mfs(p,n,x,y+1);
                if(a){
                        return true;
                }
                p[x][y] = true;
                return false;
        }
        static boolean chk(boolean[][] p, int n){
                for(int i = 0;i < n; ++i){
                        for(int j = 0;j < n; ++j){
                                if(p[i][j]){
                                        return true;
                                }
                        }
                }
                return false;
        }
}