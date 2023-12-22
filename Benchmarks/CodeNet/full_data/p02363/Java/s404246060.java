import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] argv) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int v = Integer.parseInt(str[0]);
        int e = Integer.parseInt(str[1]);

        long[][] map = new long[v][v];
        for(long[] obj: map)
            Arrays.fill(obj, Long.MAX_VALUE/2);
        for(int i=0; i<v; i++)
            map[i][i] = 0;

        for(int j=0; j<e; j++){
            str = br.readLine().split(" ");
            int from = Integer.parseInt(str[0]);
            int to = Integer.parseInt(str[1]);
            int cost = Integer.parseInt(str[2]);

            map[from][to] = cost;
        }
        for (int k = 0; k < v; k++) {
            for(int i=0; i<v; i++) {
                for (int j = 0; j < v; j++) {
                    if (map[i][j] > map[i][k] + map[k][j])
                        map[i][j] = map[i][k] + map[k][j];
                }
            }
        }

        for (int i=0; i<v; i++) {
            if (map[i][i] < 0){
                System.out.println("NEGATIVE CYCLE");
                System.exit(0);
            }
        }

        for(int i=0; i<v; i++) {

            String[] out = new String[v];
            for (int j = 0; j < v; j++) {
                if (map[i][j] > Long.MAX_VALUE/3) {
                    out[j] = "INF";
                } else {
                    out[j] = String.valueOf(map[i][j]);
                }
            }
            System.out.println(String.join(" ", out));
        }

    }
}