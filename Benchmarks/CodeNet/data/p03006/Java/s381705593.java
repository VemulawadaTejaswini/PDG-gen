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
                int dx = Math.abs(x[i]-x[j]);
                int dy = Math.abs(y[i]-y[j]);
                int cnt = 0;
                if(dx==0 || dy==0)continue;
                for(int k = 0; k<n; k++) {
                    for (int l = k+1; l < n; l++) {
                        int dx1 = Math.abs(x[k]-x[l]);
                        int dy1 = Math.abs(y[k]-y[l]);
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
