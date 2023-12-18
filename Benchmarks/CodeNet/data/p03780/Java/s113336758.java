import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        boolean[] need = new boolean[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        int amin = Arrays.stream(a).min().getAsInt();
        if(amin > k){
            System.out.println(n);
            return;
        }

        for(int i=0; i<n; i++){
            if(a[i] + amin >= k && a[i] != amin){
                need[i] = true;
            }
        }

        int[][] dpl = new int[n][k];
        int[][] dpr = new int[n][k];
        dpl[0][0] = 1;
        dpr[n-1][0] = 1;
        if(a[0] < k) dpl[0][a[0]] = 1;
        if(a[n-1] < k) dpr[n-1][a[n-1]] = 1;
        for(int i=1; i<n; i++){
            dpl[i][0] = 1;
            for(int j=0; j<k-a[i]; j++){
                if(dpl[i-1][j] == 1) dpl[i][j+a[i]] = 1;
            }

            dpr[n-i-1][0] = 1;
            for(int j=0; j<k-a[n-i-1]; j++){
                if(dpr[n-i][j] == 1) dpr[n-i-1][j+a[n-i-1]] = 1;
            }

            for(int j=0; j<k; j++){
                if(dpl[i-1][j] == 1) dpl[i][j] = 1;
                if(dpr[n-i][j] == 1) dpr[n-i-1][j] = 1;    
            }
        }

        for(int i=0; i<n; i++){
            for(int j=1; j<k; j++){
                dpl[i][j] = dpl[i][j-1] + dpl[i][j];
                dpr[i][j] = dpr[i][j-1] + dpr[i][j];
            }
        }

        for(int i=1; i<n-1; i++){
            if(need[i]) continue;
            if(dpr[i+1][k-1] - dpr[i+1][Math.max(0, k-1-a[i])] >= 1) need[i] = true;
            if(dpl[i-1][k-1] - dpl[i-1][Math.max(0, k-1-a[i])] >= 1) need[i] = true;
            for(int j=1; j<k; j++){
                if(dpl[i-1][j]-dpl[i-1][j-1]>=1){
                    if(dpr[i+1][Math.max(0, k-1-j)] - dpr[i+1][Math.max(0, k-1-j-a[i])] >= 1) need[i] = true;
                }
            }
        }
        if(!need[0]){
            if(dpr[1][k-1] - dpr[1][Math.max(0, k-1-a[0])] >= 1) need[0] = true;
        }
        if(!need[n-1]){
            if(dpl[n-2][k-1] - dpl[n-2][Math.max(0, k-1-a[n-1])] >= 1) need[n-1] = true;
        }

        int ans = 0;
        for(int i=0; i<n; i++) if(!need[i]) ans++;
        System.out.println(ans);
    }
}