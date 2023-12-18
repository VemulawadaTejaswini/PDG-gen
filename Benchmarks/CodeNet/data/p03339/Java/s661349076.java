import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        char[] member = new char[N];

        for (int i=0; i<N; i++) {
            member[i] = S.charAt(i);
        }

        int ans = N;

        for (int i=0; i<N; i++) {
            int count = 0;
            for (int j=0; j<i; j++) {
                if ( member[j] == 'W') {
                    count++;
                }
            }
            for (int j=i; j<N; j++) {
                if (member[j] == 'E') {
                    count++;
                }
            }
            ans = Math.min(ans, count);
        }
        System.out.println(ans);
    }
}