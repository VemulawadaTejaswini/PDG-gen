import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i,j,tmp;
        int[][] A = new int[101][101];
        int[] n = new int[990];
        String[] str = new String[990];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        str = in.readLine().split(" ");
        for(i=0;i<2;i++){
            n[i]=Integer.parseInt(str[i]);   
        } 
        for(i=0;i<n[0];i++){
            str = in.readLine().split(" ");
            for(j=0;j<n[1];j++){
                tmp = Integer.parseInt(str[j]);
                A[i][j]+=tmp; A[n[0]][j]+=tmp; A[i][n[1]]+=tmp; A[n[0]][n[1]]+=tmp;
            }
        }
        for(i=0;i<=n[0];i++){
            for(j=0;j<=n[1];j++){
                if(j!=0) System.out.print(" ");
                System.out.print(A[i][j]);
            }
            System.out.println();
        }        
        System.out.flush();
    }
}