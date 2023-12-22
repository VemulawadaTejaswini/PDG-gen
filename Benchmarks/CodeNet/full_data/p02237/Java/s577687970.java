import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final int[][] mat = new int[n][n];
        StringTokenizer st;
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            final int u = Integer.parseInt(st.nextToken())-1;
            final int k = Integer.parseInt(st.nextToken());
            for(int j = 0; j<k; j++){
                ++mat[u][Integer.parseInt(st.nextToken())-1];
            }
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            sb.append(mat[i][0]);
            for(int j = 1; j<n; j++){
                sb.append(' ').append(mat[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}