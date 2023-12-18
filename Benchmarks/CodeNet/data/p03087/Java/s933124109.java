import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        char [] S_N = new char [S.length() * N]; 

        for (int i = 0; i < (S.length() * N); i++) {
            S_N[i] = S.charAt(i % S.length());
        }

        int a[] = new int [S.length() * N];
        for (int i = 1; i < (S.length() * N); i++) {
            a[i] = 0;
            if ( S_N[i - 1] == 'A' && S_N[i] == 'C') a[i] = 1; 
        }

        int s[] = new int [S.length() * N];
        s[0] = a[0];
        for (int i = 1; i < (S.length() * N); i++) {
            if ( a[i] == 1 ) {
                s[i] += s[i-1] + a[i];
            } else { s[i] = s[i-1]; } 
        }

        for (int q = 0; q < Q; q++ ) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = s[r-1] - s[l-1];

            System.out.println( ans ); 
        }
    }
}