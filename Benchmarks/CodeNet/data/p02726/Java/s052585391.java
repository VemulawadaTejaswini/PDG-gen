import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();

        x--;
        y--;

        int[] t = new int[n];
        for (int j = 0; j < n; j++) {

            Queue<Integer> que = new LinkedList<>();
            int[] dis = new int[n];

            Arrays.fill(dis,Integer.MAX_VALUE);

            dis[j] = 0;
            que.add(j);

            while (!que.isEmpty()){
                Integer in = que.poll();
                int d = dis[in];
                if(in > 0 && add(in-1,d+1,dis)){
                    que.add(in-1);
                }
                if(in < n-1 && add(in+1,d+1,dis)) {
                    que.add(in + 1);
                }
                if(in == x && add(y,d+1,dis)){
                    que.add(y);
                }
                if(in == y && add(x,d+1,dis)){
                    que.add(x);
                }
            }

            for (int i = 0; i < t.length; i++) {
                t[dis[i]]++;
            }
        }

        for (int i = 1; i < t.length; i++) {
            System.out.println(t[i]/2);
        }
    }

    private static boolean add(int i, int d, int[] dis) {
        if(dis[i] != Integer.MAX_VALUE) return false;
        dis[i] = d;
        return true;
    }
}
