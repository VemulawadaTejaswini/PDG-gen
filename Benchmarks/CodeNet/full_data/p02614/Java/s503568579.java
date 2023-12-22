import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char map[][];
        map = new char[H][W];

        int ans = 0;

        for(int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j = 0; j < W; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < (1 << H); i++) {
            for(int j = 0; j < (1<<W); j++) {

                int mark = 0;

                for(int k = 0; k < H; k++) {
                    if((i>>k & 1) == 1) continue;
                    for(int l = 0; l < W; l++) {
                        if((j>>l & 1) == 1) continue;
                        if(map[k][l] == '#') mark++;
                    }
                }

                if(mark == K) ans++;
            }
        }

        pw.println(ans);
        br.close();
        pw.close();
    }
}