import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i<n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int max = 1;
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                long dx = Math.abs(x[i]-x[j]);
                long dy = Math.abs(y[i]-y[j]);
                int cnt = 0;
                if(dx==0 || dy==0)continue;
                for(int k = 0; k<n; k++) {
                    for (int l = k+1; l < n; l++) {
                        long dx1 = Math.abs(x[k]-x[l]);
                        long dy1 = Math.abs(y[k]-y[l]);
                        if(dx==dx1 && dy==dy1) cnt++;
                    }
                }
                //System.out.println(cnt);
                max = Math.max(cnt,max);
            }
        }
        System.out.println(n-max);
    }

}
