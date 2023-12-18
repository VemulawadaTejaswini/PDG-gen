import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[4];
        a[1] = w;
        a[3] = h;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int b = sc.nextInt()-1;
            if(b == 0 && a[0] < x) a[0] = x;
            if(b == 1 && x < a[1]) a[1] = x;
            if(b == 2 && a[2] < y) a[2] = y;
            if(b == 3 && y < a[3]) a[3] = y;
        }
        System.out.println(Math.max(0, (a[1]-a[0])*(a[3]-a[2])));
        sc.close();

    }

}
