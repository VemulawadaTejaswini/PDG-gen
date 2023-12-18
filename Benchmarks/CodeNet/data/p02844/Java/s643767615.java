import java.util.*;

class Main {
    public static void main(String[] args) {
        final long MOD = 1_000_000_007L;
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final String S = sc.next();
        sc.close();

        int cnt = 0;
        for (int i=0; i<10; i++) {
            int a = S.indexOf(Integer.toString(i));
            if (a<0 || a>=S.length()-2) continue;
            for (int j=0; j<10; j++) {
                int b = S.substring(a+1).indexOf(Integer.toString(j));
                if (b<0 || b>=S.substring(a+1).length()-1) continue;
                for (int k=0; k<10; k++) {
                    int c = S.substring(a+1).substring(b+1).indexOf(Integer.toString(k));
                    if (c<0 || c>=S.substring(a+1).substring(b+1).length()) continue;
                    cnt++;
                    cnt %= MOD;
                }
            }
        }
        
        System.out.println(cnt);
    }
}