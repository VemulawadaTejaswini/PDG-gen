import java.io.*;
import java.util.*;
 
class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        long[][] matrix1 = new long[n][m];
        long[][] matrix2 = new long[m][l];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = Long.parseLong(st.nextToken());
            }
        }
        for (int i = 0; i < m; i++) {
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<l;j++){
                matrix2[i][j]=Long.parseLong(st.nextToken());
            }
        }
        long[][] sum = dot(matrix1, matrix2, n, m,l);
        for (int i = 0; i < n; i++) {
            for(int j=0;j<l;j++){
                if(j!=l-1){ System.out.print(sum[i][j]+" "); }
                else System.out.print(sum[i][j]);
            }System.out.println();
        }
    }
 
    static long[][] dot(long[][] matrix1, long[][] matrix2, int n, int m,int l) {
        long[][] sum = new long[n][l];
        for(int i=0;i<n;i++){ Arrays.fill(sum[i], 0); }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                for(int k=0;k<m;k++){
                    sum[i][j]+=(matrix1[i][k]*matrix2[k][j]);
                }
            }
        }
        return sum;
    }
}
 