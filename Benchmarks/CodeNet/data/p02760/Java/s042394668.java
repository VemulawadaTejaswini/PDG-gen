import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        boolean[][] plotA = new boolean[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j] = Integer.parseInt(sc.next());
                plotA[i][j] = false;
            }
        }
        int N = Integer.parseInt(sc.next());
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(sc.next());
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(num == A[j][k]){
                        plotA[j][k] = true;
                    }
                }
            }
        }
        boolean isBingo = false;
        for(int i=0;i<3;i++){
            if(plotA[i][0] && plotA[i][1] && plotA[i][2])isBingo = true;
            if(plotA[0][i] && plotA[1][i] && plotA[2][i])isBingo = true;
        }
        if(plotA[0][0] && plotA[1][1] && plotA[2][2])isBingo = true;
        if(plotA[0][2] && plotA[1][1] && plotA[2][0])isBingo =true;
        System.out.println(isBingo ? "Yes" : "No");
    }
}
