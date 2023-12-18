import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append('1');
        for (int i=0;i<N-1;i++) {
            sb.append('0');
        }
        boolean[] flag = new boolean[N];
        char[] ans = sb.toString().toCharArray();
        for (int i=0;i<M;i++) {
            int s = sc.nextInt()-1;
            int c = sc.nextInt();
            if (s==0 && c==0 && N!=1) {
                System.out.println(-1);
                return;
            }
            if (flag[s] && ans[s]!=(char)(c+48)) {
                System.out.println(-1);
                return;
            }
            ans[s] = (char)(c+48);
            flag[s] = true;
        }
        for (int i=0;i<N;i++) {
            System.out.print(ans[i]);
            if (i==N-1) System.out.println("");
        }
    }
}