import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextInt();
        long W = sc.nextInt();

        long ans = Math.min(H, W);
        if (H%3==0 || W%3==0) ans = 0;

        long w = W/2;
        long h = H*W/3/w;
        for (int i=(int)w-10;i<(int)w+10;i++) {
            for (int j=(int)h-10;j<(int)h+10;j++) {
                if (i<=0 || i>=W) continue;
                if (j<=0 || j>=H) continue;
                long[] area = new long[3];
                area[0] = (long)i*j;
                area[1] = (W-i)*j;
                area[2] = W*(H-j);
                Arrays.sort(area);
                ans = Math.min(ans, area[2]-area[0]);
            }
        }

        long y = H/2;
        long x = H*W/3/y;
        for (int i=(int)x-10;i<(int)x+10;i++) {
            for (int j=(int)y-10;j<(int)y+10;j++) {
                if (i<=0 || i>=W) continue;
                if (j<=0 || j>=H) continue;
                long[] area = new long[3];
                area[0] = i*j;
                area[1] = i*(H-j);
                area[2] = (W-i)*H;
                Arrays.sort(area);
                ans = Math.min(ans, area[2]-area[0]);
            }
        }
        System.out.println(ans);
    }
}