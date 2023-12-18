import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        boolean[] q = new boolean[n];
        for(int i=0; i<m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            if(h[a] < h[b]) {
                q[a] = true;
            } else if (h[a] > h[b]) {
                q[b] = true;
            } else {
                q[a] = true;
                q[b] = true;
            }
        }
        int res = 0;
        for(int i=0; i<n; i++) {
            if(!q[i]) res++;
        }

        System.out.println(res);
    }
}