import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int [][] List = new int[H+1][W+1];
        int [][] DP = new int[H+1][W+1];
        Arrays.fill(DP[0],0);
        Arrays.fill(List[0],0);
        for(int i=1;i<H+1;i++){
            Arrays.fill(DP[i],0);
            Arrays.fill(List[i],0);
            String s = sc.next();
            for(int j=1;j<W+1;j++){
                if(s.charAt(j-1)=='#'){
                    List[i][j] = 1;
                    DP[i][j]=-1;
                }
            }
        }
        DP[1][1]=1;
        for(int i=1;i<H+1;i++){
            for(int j=1;j<W+1;j++){
                if(DP[i][j]!=-1) {
                    if (DP[i][j - 1] != -1) {
                        DP[i][j] += DP[i][j - 1];
                        DP[i][j] %= 1000000007;
                    }
                    if (DP[i - 1][j] != -1) {
                        DP[i][j] += DP[i - 1][j];
                        DP[i][j] %= 1000000007;
                    }
                }
            }
        }
        System.out.println(DP[H][W]);
    }
}
