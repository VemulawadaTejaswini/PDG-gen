import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();

        int[] blackcount = new int[N];
        int bkl = 0;
        for (int i = 0; i<N; i++) {
            if (S.charAt(i)== '#') bkl++;
            blackcount[i] = bkl;
        }
        int blackall = blackcount[N-1];
        int count = N;
        for (int i = 0; i < N; i++) {
            int leftchange = blackcount[i];
            int rightchange = (N-1-i-(blackall-leftchange));
            count = Math.min(count,(leftchange+rightchange));
        }
        System.out.println(count);
    }
}