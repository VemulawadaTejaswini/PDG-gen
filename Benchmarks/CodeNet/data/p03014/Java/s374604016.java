import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    static long mod = 1000000000+7;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int H = sc.nextInt(), W = sc.nextInt();
        char[][] g = new char[H][];
        for(int i=0;i<H;i++) g[i] = sc.next().toCharArray();
        int[][] left = new int[H][W], right=new int[H][W], up=new int[H][W], down=new int[H][W];
        // do left and right first
        for(int i=0;i<H;i++){
            // do right first
            int cnt = 0;
            for(int j=0;j<W;j++){
                if(g[i][j]=='#') cnt=0;
                else left[i][j] = cnt++;
            }
            cnt = 0;
            for(int j=W-1;j>=0;j--){
                if(g[i][j]=='#') cnt=0;
                else right[i][j] = cnt++;
            }
        }
        // do up and down
        for(int j=0;j<W;j++){
            // do up first
            int cnt = 0;
            for(int i=0;i<H;i++){
                if(g[i][j]=='#') cnt = 0;
                else up[i][j] = cnt++;
            }
            cnt = 0;
            for(int i=H-1;i>=0;i--){
                if(g[i][j]=='#') cnt=0;
                else down[i][j] = cnt++;
            }
        }
        int ans = 0;
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(g[i][j]=='#') continue;
                int cur = 1+left[i][j]+right[i][j]+up[i][j]+down[i][j];
                ans = Math.max(ans,cur);
            }
        }
        System.out.println(ans);
    }
}

