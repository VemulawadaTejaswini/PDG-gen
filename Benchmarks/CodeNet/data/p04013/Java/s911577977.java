import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int NA = N*A;
        int[] x = new int[N];
        int[] sumfx = new int[N];
        int sumx = 0;
        for(int i=0;i<N;i++){
            x[i] = sc.nextInt();
            sumx += x[i];
            sumfx[i] = sumx;
        }
        
        int max = Math.max(NA,sumx);
        
        int[][][] p = new int[N][N][max+1];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                p[i][0][x[j]] ++;
            }
        }
        
        for(int i=1;i<N;i++){
            int sum = 0;
            for(int j=0;j<=i;j++){
                sum += x[j];
            }
            p[i][i][sum] = 1;
        }
        
        for(int i=1;i<N;i++){
            for(int j=1;j<i;j++){
                for(int s=0;s<=sumfx[i];s++){
                    if((s-x[i])>=0){
                        p[i][j][s] = p[i-1][j][s] + p[i-1][j-1][s-x[i]];
                    }else{
                        p[i][j][s] = p[i-1][j][s];
                    }
                }
            }
        }
        
        long result = 0;
        for(int k=0;k<N;k++){
            result += p[N-1][k][(k+1)*A];
        }
        
        System.out.println(result);
        
    }
}
