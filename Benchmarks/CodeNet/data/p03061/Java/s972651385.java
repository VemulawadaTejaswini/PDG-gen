import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        String[] s = stdR.readLine().split(" ");
        int[] A = new int[N];
        for(int i = 0 ; i < N ; i++) {
            A[i] = Integer.parseInt(s[i]);
        }
        if(N == 2) {
            System.out.println(Math.max(A[0], A[1]));
        }else if(N == 3) {
            System.out.println(Math.max(Math.max(gcd(A[0],A[2]),gcd(A[0],A[1])), gcd(A[1],A[2])));
        }else {
            int[] front = new int[N - 1];
            front[0] = gcd(A[0],A[1]);
            int[] back = new int[N - 1];
            back[0] = gcd(A[A.length - 2], A[A.length - 1]);
            for(int i = 1 ; i < N - 1 ; i++) {
                front[i] = gcd(front[i - 1], A[i + 1]);
                back[i] = gcd(back[i - 1], A[A.length - i - 2]);
            }
            int max = back[N - 3];//0
            for(int i = 1 ; i < N  ; i++) {
                if(i == 1) {
                    max = Math.max(max, gcd(A[0], back[N - 3 - i]));
                }else if(i == N - 1) {
                    max = Math.max(max, front[N - 3]);
                }else if(i == N - 2){
                    max = Math.max(max, gcd(A[N - 1], front[N - 4]));
                }else {
                    max = Math.max(max, gcd(front[i - 2], back[N - 3 - i]));
                }
            }
            System.out.println(max);
        }
    }
    
    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
