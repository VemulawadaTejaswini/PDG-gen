import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] nn = new long[n];
        long[] mm = new long[m];
        for(int i=0; i<n; i++) {
            nn[i] = sc.nextLong();
        }
        for(int i=0; i<m; i++) {
            mm[i] = sc.nextLong();
        }
        int ans = 0;
        long nTmp = 0;
        int i = 0;
        for(; i<n; i++) {
            if((nTmp + nn[i]) <= k) {
                nTmp += nn[i];
                ans++;
            } else {
                break;
            }
        }
        for(int j=0; j<m; j++) {
            if((nTmp + mm[j]) <= k) {
                nTmp += mm[j];
                ans++;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}