import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        int k = N*M/(gcd(N,M));
        String[] ar = new String[k];
        for (int i = 1; i < k;i++) {
            int Nnum = i*(k/N);
            int Mnum = i*(k/M);
            if (Nnum < ar.length) {
                if (ar[Nnum] == null) {
                    ar[Nnum] = S.substring(i, i+1);
                } else {
                    if (!ar[Nnum].equals(S.substring(i, i+1))) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
            if (Mnum < ar.length) {
                if (ar[Mnum] == null) {
                    ar[Mnum] = T.substring(i, i+1);
                } else {
                    if (!ar[Mnum].equals(T.substring(i, i+1))) {
                        System.out.println(-1);
                        return;
                    }
                }  
            }         
        }
        System.out.println(k);
    }
    
    private static int gcd(int a, int b) {
        int tmp = a % b;
        int ans = 0;
        if (tmp == 0) {
            ans = b;
        } else {
            ans = gcd(b, tmp);
        }
        return ans;
    }
    
}
