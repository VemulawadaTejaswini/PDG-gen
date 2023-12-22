import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i,j,k;
        long sum;
        int[][] A = new int[101][101];
        int[][] B = new int[101][101];
        int[] n = new int[990];
        String[] str = new String[990];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        str = in.readLine().split(" ");
        for(i=0;i<3;i++){
            n[i]=Integer.parseInt(str[i]);   
        }
        for(i=0;i<n[0];i++){
            str = in.readLine().split(" ");
            for(j=0;j<n[1];j++){
                A[i][j]=Integer.parseInt(str[j]);
            }
        }
        for(i=0;i<n[1];i++){
            str = in.readLine().split(" ");
            for(j=0;j<n[2];j++){
                B[i][j]=Integer.parseInt(str[j]);
            }
        }
        for(i=0;i<n[0];i++){
            for(j=0;j<n[2];j++){
                sum=0;
                for(k=0;k<n[1];k++){
                    sum += B[k][j]*A[i][k];             
                }
                if(j!=0) System.out.print(" ");
                System.out.print(sum);
            }
            System.out.println();
        }      
        System.out.flush();
    }
}