import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            char[] s1 = bf.readLine().toCharArray();
            char[] s2 = bf.readLine().toCharArray();
            sb.append(lcs(s1,s2)).append("\n");
        }
        System.out.print(sb);
    }

    private static int lcs(char[] s1, char[] s2) {
        int m=s1.length;
        int n=s2.length;
        int c[][] =new int[m+1][n+1];
        int max=0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=n ; j++) {
                if (s1[i-1]==s2[j-1]){
                    c[i][j]=c[i-1][j-1]+1;
                }else {
                    c[i][j]=Math.max(c[i-1][j],c[i][j-1]);
                }
                max =Math.max(max,c[i][j]);
            }
        }
        return max;
    }
}
