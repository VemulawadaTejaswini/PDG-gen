import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n+1];
        for(int i=1; i<=n; i++) {
            f[i] = f[i % Integer.bitCount(i)]+1;
        }
        char[] c = sc.next().toCharArray();
        int nb = 0;
        for(int i=0; i<n; i++) {
            if(c[i] == '1') nb++;
        }
        int[][] a = new int[n][3];
        int[] base = new int[3];
        for(int k = -1; k<=1; k++) {
            int l = nb + k;
            if(l <= 0 || l > n) continue;
            a[0][k+1] = 1 % l;
            if(c[n-1] == '1') {
                base[k+1] += a[0][k+1];
                base[k+1] %= l;
            }
            for(int i=1; i<n; i++) {
                a[i][k+1] = (a[i-1][k+1] * 2) % l;
                if(c[n-1-i] == '1') {
                    base[k+1] += a[i][k+1];
                    base[k+1] %= l;
                }
            }
        }
        for(int i=n-1; i>=0; i--) {
            int res = 0;
            if(c[n-1-i] == '1') {
                int l = nb - 1;
                if(l==0) {
                    res = 0;
                } else {
                    res = f[(base[0] - a[i][0] + l) % l] + 1;
                }
            } else {
                int l = nb + 1;
                res = f[(base[2] + a[i][2]) % l] + 1;
            }
            System.out.println(res);
        }




    }




}