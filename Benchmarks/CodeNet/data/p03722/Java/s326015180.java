import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static class edge {
        int from, to, cost;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        edge es[] = new edge[m];
        for(int i=0; i<m; i++){
            edge e = new edge();
            s = br.readLine().split(" ");
            e.from = Integer.parseInt(s[0]);
            e.to = Integer.parseInt(s[1]);
            e.cost = Integer.parseInt(s[2]);
            es[i] = e;
        }

        long score[] = new long[n+1];
        score[0] = 0;
        score[1] = 0;
        for(int i=2; i<n+1; i++) score[i] = Long.MIN_VALUE;

        int step = 0;
        while(true){
            step++;
            boolean update = false;
            for(int i=0; i<m; i++){
                edge e = es[i];
                if(score[e.from] + e.cost > score[e.to]){
                    score[e.to] = score[e.from] + e.cost;
                    update = true;
                }
            }
            if(!update) break;

            if(step > n){
                System.out.println("inf");
                System.exit(0);
            }
        }

        System.out.println(score[n]);
    }
}