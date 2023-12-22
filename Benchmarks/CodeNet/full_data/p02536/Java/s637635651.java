import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main ak = new Main();
        ak.solve(sc);

    }
    void solve(Scanner in){
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m][2];
        for(int i=0;i<m;i++){
            arr[i] = new int[]{in.nextInt(),in.nextInt()};
        }
        int[] par = new int[n];
        Arrays.fill(par,-1);
        for(int i=0;i<m;i++){
            union(par,arr[i][0],arr[i][1]);
        }
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(par[i]<0) cnt++;
        }
        System.out.println(cnt-1);
    }
    int find(int[] par, int i){
        if(par[i]<0) return i;
        return par[i] = find(par,par[i]);
    }
    void union(int[] par, int i, int j){
        int pi = find(par,i);
        int pj = find(par,j);
        if(pi==pj) return;
        if(par[pi]<par[pj]){
            par[pi]+=par[pj];
            par[pj] = pi;
        }else{
            par[pj]+=par[pi];
            par[pi] = pj;
        }
    }

}
