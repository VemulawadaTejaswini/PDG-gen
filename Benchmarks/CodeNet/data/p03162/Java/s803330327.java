import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int [][] List = new int[N][3];
        int [] DP = new int[3];
        for(int i=0;i<N;i++){
            List[i][0] = sc.nextInt();
            List[i][1] = sc.nextInt();
            List[i][2] = sc.nextInt();
        }
        for(int i=0;i<3;i++) DP[i]=List[0][i];
        for(int i=1;i<N;i++){
            int [] DP2 = new int[3];
            for(int j=0;j<3;j++) DP2[j] = DP[j];
            for(int j=0;j<3;j++){
                int DP_max = 0;
                for(int k = 0;k<3;k++) if(j!=k&&DP[k]>DP_max) DP_max = DP[k];
                DP2[j]=DP_max+List[i][j];
            }
            for(int j=0;j<3;j++) DP[j]=DP2[j];
        }
        int max = 0;
        for(int i=0;i<3;i++) if(max<DP[i]) max = DP[i];
        System.out.println(max);
    }
}