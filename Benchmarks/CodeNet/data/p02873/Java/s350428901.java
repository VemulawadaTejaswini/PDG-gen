import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int[] num = new int[N+1];

        // from left to right
        int tmp = 0;
        for (int i=0;i<N;i++) {
            if (S.charAt(i)=='<') {
                num[i]=tmp;
                tmp++;
            } else {
                if (0<i && S.charAt(i-1)=='<') {
                    num[i]=tmp;
                }
                tmp=0;
            }
        }
        if (S.charAt(N-1)=='<') {
            num[N]=tmp;
        }

        // from right to left
        tmp = 0;
        for (int i=N-1;i>=0;i--) {
            if (S.charAt(i)=='>') {
                num[i+1]=tmp;
                tmp++;
            } else {
                if (N-1>i && S.charAt(i+1)=='>') {
                    num[i+1]=Math.max(num[i+1], tmp);
                }
                tmp=0;
            }
        }
        if (S.charAt(0)=='>') {
            num[0]=tmp;
        }

        long ans = 0L;
        for (int i=0;i<N+1;i++) {
            ans += (long)num[i];
        }
        System.out.println(ans);
        // System.out.println(Arrays.toString(num));
    }
}