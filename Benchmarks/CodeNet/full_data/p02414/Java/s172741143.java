import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static int n;
    static int m;
    static int l;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        l = sc.nextInt();
        int[][] vec1 = new int[n][m];
        int[][] vec2 = new int[m][l];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                vec1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<l;j++){
                vec2[i][j]=sc.nextInt();
            }
        }
        int[][] ans = vecMul(vec1,vec2);
        print(ans);
    }
    static void print(int[][] ans) {
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]);
                if(j!=ans.length-1)
                System.out.println(" ");
            }
            if(i!=ans.length-1)
            System.out.println();
        }
    }
    static int[][] vecMul(int[][] vec1,int[][] vec2) {
        int[][] ans = new int[n][l];
        int sum=0;
        //かける回数はn*lの要素数に等しい

        for(int i=0;i<n;i++){
            //完成する列 l までかける,これで出力の1行が完成する
            for(int j=0;j<l;j++){
                //vec2の行をかける
                for(int k=0;k<vec2.length;k++) {
                    sum += vec1[i][k] * vec2[k][j];
                }
                ans[i][j] = sum;
                sum=0;
            }
        }
        return ans;
    }
}