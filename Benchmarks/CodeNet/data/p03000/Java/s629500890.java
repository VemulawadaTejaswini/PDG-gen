import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n];
        int[] sum = new int[n+1];
        for (int i=0; i<n; i++) l[i] = sc.nextInt();
        for (int i=1; i<n+1; i++) sum[i] = sum[i-1] + l[i-1];

        int res = 0;
        for (int i=0; i<n+1; i++) {
            if (sum[i] <= x) res++;
        }

        System.out.println(res);
    }


}
