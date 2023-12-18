import java.util.*;
import static java.lang.Math.*;

public class Main{
    static boolean memo[];
    static int j;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int map[][] = new int[n-1][3];
        int a_cnt[] = new int[m];
        int cnt = 0;
        memo  = new boolean[m];
        
        for(int i=0; i<m; i++){
            map[i][0] = sc.nextInt(); //X
            map[i][1] = sc.nextInt(); //Y
            map[i][2] = sc.nextInt(); //Z
        }
        
        for(int j=0; j<m; j++){
            dfs();
            cnt++;
        }


        boolean ans = true;
        for(int i=0;i<m; i++){
            ans &= memo[i];
        }
        if(ans){
            System.out.println(cnt);
        }
        
    }
    static void dfs(){
        memo[map[j][0]] = true;
        if(memo[map[j][1]]!= true){
            j++;
            dfs();
        }
    }
}