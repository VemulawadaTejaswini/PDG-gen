import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] a = new int[n][d];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < d; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
              if(distance(a[i], a[j], d))count++;
            }
        }
        System.out.println(count);
    }

    public static boolean distance(int[] distA, int[] distB, int d) {
        double dist = 0;
        for(int i = 0; i < d; i++) {
            int num = Math.abs(distA[i] - distB[i]);
              dist += (num * num);
        }
        double root = Math.sqrt(dist);
        return root == (long)root;
    }
}
