
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String input;
        int n, m, l, k, a, h;
        int inf = 10000000;
        while(true){
            n = scan.nextInt();
            m = scan.nextInt();
            l = scan.nextInt();
            k = scan.nextInt();
            a = scan.nextInt();
            h = scan.nextInt();
            if(n == 0 && m == 0 && l == 0 && k== 0 && a == 0 && h == 0){
                break;
            }
            int[] bloodCenters = new int[l + 2];
            int[][] path = new int[n][n];
            int[][] newpath = new int[l + 2][l + 2];
            bloodCenters[0] = a;
            bloodCenters[1] = h;
            for(int i=2; i<l+2; i++){
                bloodCenters[i] = scan.nextInt();
            }

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(i==j) path[i][j] = 0;
                    else path[i][j] = inf;
                }
            }

            for(int i=0; i<l+2; i++){
                for(int j=0; j<l+2; j++){
                    if(i==j) newpath[i][j] = 0;
                    else newpath[i][j] = inf;
                }
            }

            for(int i=0; i<k; i++){
                int start = scan.nextInt(), end = scan.nextInt(), dist = scan.nextInt();
                path[start][end] = dist;
                path[end][start] = dist;
            }

            for(int i=0; i<bloodCenters.length; i++){
                for(int j=i+1; j<bloodCenters.length; j++){
                    int dist = dijkstra(path, bloodCenters[i], bloodCenters[j]);
                    if(dist <= m) {
                        newpath[i][j] = dist;
                        newpath[j][i] = dist;
                    }
                }
            }

            int dist = dijkstra(newpath, 0, 1);
            if(dist == inf){
                System.out.println("Help!");
            } else {
                System.out.println((dist-m)>0?(dist-m)*2+m: dist);
            }
        }
    }

    private static int dijkstra(int[][] path, int start, int end){
        int current = start;
        int inf = 10000000;
        int[] distances = new int[path.length];
        boolean[] decided = new boolean[path.length];
        for(int i=0; i<distances.length; i++){
            distances[i] = inf;
        }
        distances[start] = 0;
        decided[start] = true;
        while(current != end) {
            int next = -1;
            int min = inf;
            for (int i = 0; i < path.length; i++) {
                if(distances[i] > path[i][current] + distances[current]){
                    distances[i] = path[i][current] + distances[current];

                }
                if(distances[i] < min && !decided[i]){
                    min = distances[i];
                    next = i;
                }
            }
            if(next == -1){
                break;
            }
            current = next;
            decided[next] = true;
        }

        return distances[end];
    }

}