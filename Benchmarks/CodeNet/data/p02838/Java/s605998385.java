import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer l[] = new Integer[n];
        for (int i=0; i<n; i++) {
            l[i] = sc.nextInt();
        }
        int mod = 1000000007;
        int zeros[] = new int[60];
        int ones[] = new int[60];
 
        for (int i=0; i<n; i++) {
            int x = l[i];
            for (int j=0; j<60; j++) {
                if (((x>>j)&1)==1) {
                    ones[j] ++;
                }
                else {
                    zeros[j] ++;
                }
            }
        }
        int ans = 0;
        int two = 1;
        for (int j=0; j<60; j++) {
            ans = (ans + zeros[j]*ones[j]*two)%mod;
            two *= 2;
        }
        System.out.println(ans);
        sc.close();
    }
}