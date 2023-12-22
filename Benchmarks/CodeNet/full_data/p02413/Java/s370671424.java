import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int r = Integer.parseInt(line[0]);
        int c = Integer.parseInt(line[1]);
        int[][] sheet = new int[r+1][c+1];

        for(int i = 0; i < r; i++){
            line = br.readLine().split(" ");
            int[] a = new int[c];
            for(int k = 0; k < c; k++){
                a[k] = Integer.parseInt(line[k]);
            }
            for(int j = 0; j < c; j++){
                sheet[i][j] = a[j];
                sheet[r][c] += a[j];
                sheet[i][c] += a[j];
                sheet[r][j] += a[j];
            }
        }

        for(int i = 0; i <= r; i++){
            for(int j = 0; j <= c; j++){
                 System.out.print(sheet[i][j]);
                 if(j != c)
                   System.out.print(" ");
            }
                System.out.print("\n");
        }
    }
}