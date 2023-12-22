import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int MAX = 100000;
        int[][] map = new int[512][MAX+1];

        int[] v = new int[n];
        int[] w = new int[n];
        for(int i=0; i<n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        for(int k=w[0]; k<=100000; k++) {
            map[1][k] = v[0];
        }
        for(int i=2; i<512; i++) {
            int j = i/2;
            if(i > n) break;
            for(int k = 0; k <= MAX; k++) {
                map[i][k] = Math.max(map[i][k], map[j][k]);
                if(k + w[i-1] > MAX) continue;
                map[i][k+w[i-1]] = Math.max(map[i][k+w[i-1]], map[j][k]+v[i-1]);
            }
        }

        int q = sc.nextInt();

        for(int i=0; i<q; i++) {
            int x = sc.nextInt();
            int l = sc.nextInt();
            if(x < 512) {
                System.out.println(map[x][l]);
                continue;
            }
            int xl = 32 - Integer.numberOfLeadingZeros(x);
            int m = xl-9;
            int[] path = new int[m];
            for(int j=0; j<m; j++) {
                path[j] = xl >> j;
            }
            int base = x >> m;
            int max = 0;
            for(int j=0; j<1<<m; j++) {
                int cost = 0;
                int value = 0;
                for(int k=0; k<m; k++) {
                    if((j>>k)%2 == 1) {
                        cost += w[path[k]-1];
                        value += v[path[k]-1];
                    }
                }
                if(cost <= l) {
                    max = Math.max(max, map[base][l-cost] + value);
                }
            }
            System.out.println(max);
        }
    }




}