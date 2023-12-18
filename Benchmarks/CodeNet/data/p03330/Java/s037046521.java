
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N=scanner.nextInt();
        final int C=scanner.nextInt();
        final int[][] D=new int[C][C];
        for(int i=0;i<C;i++){
            for(int j=0;j<C;j++){
                D[i][j]=scanner.nextInt();
            }
        }
        final int[][] mat=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                mat[i][j]=scanner.nextInt();
            }
        }
        long min=Long.MAX_VALUE;
        int[][] memo=new int[3][C];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                memo[(i+j+2)%3][mat[i][j]-1]++;
            }
        }
        int[] c=new int[3];
        for(c[0]=0;c[0]<C;c[0]++){
            for(c[1]=0;c[1]<C;c[1]++){
                for(c[2]=0;c[2]<C;c[2]++){
                    if(c[0]==c[1]||c[1]==c[2]||c[0]==c[2]) continue;
                    long d_min=0;
                    for(int i=0;i<3;i++){
                        for(int j=0;j<C;j++){
                            d_min+=memo[i][j]*D[j][c[i]];
                        }
                    }
                    if(min>d_min){
                        min=d_min;
                    }
                }
            }
        }
        System.out.println(min);

    }
}
