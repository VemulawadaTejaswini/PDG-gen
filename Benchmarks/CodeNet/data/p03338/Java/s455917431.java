import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        System.out.println( solve(N, S) );
    }

    private static int solve(int N, String S) {
        int max = 0;

        for (int i=1; i <= N-1; i++) {
            String a = S.substring(0, i);
            String b = S.substring(i);

            int cnt = 0;
            for (int c = 'a'; c <= 'z' ; c++) {
                if( a.indexOf(c) != -1 && b.indexOf(c) != -1 ) {
                    cnt++;
                }
            }
            max = Math.max(cnt, max);
        }
        return max;
    }
}