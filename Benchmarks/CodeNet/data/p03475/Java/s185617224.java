import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n-1];
        int[] s = new int[n-1];
        int[] f = new int[n-1];
        for(int i = 0; i<n-1; i++) {
            c[i] = sc.nextInt();
            s[i] = sc.nextInt();
            f[i] = sc.nextInt();
        }
        for(int i = 0; i<n-1; i++) {
            int ans = s[i]+c[i];
            for(int j = i+1; j<n-1; j++) {
                if(ans<s[j]) {
                    ans = s[j]+c[j];
                    continue;
                }
                int kaisuu = (int)Math.ceil((double)(ans-s[j])/(double)f[j]);
                //System.out.println(ans + " " +kaisuu);
                ans += c[j] + f[j]*kaisuu-(ans-s[j]);
            }
            System.out.println(ans);
        }
        System.out.println(0);
    }
}