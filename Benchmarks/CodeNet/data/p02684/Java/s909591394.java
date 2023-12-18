import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        long k = Long.parseLong(s.next());

        int[] ai = new int[n + 1]; 
        int[] visit = new int[n + 1];
        for (int i = 1;i<= n;i++) {
            ai[i] = Integer.parseInt(s.next());
            visit[i] = -1;
        }
        visit[1] = 0;

        int lSta = -1;
        int lEnd = -1;
        int now = 1;
        for (int i =1;;i++){
            now = ai[now];
            if (visit[now] >= 0) {
                lSta = visit[now];
                lEnd = i;
                break;
            } else {
                visit[now] = i;
            }
        }
        long ans = (k - (long)lSta)%((long)lEnd-(long)lSta);
        for (int i = 1;;i++) {
          if(visit[i] == lSta + (int)ans) {
            System.out.println(i);
            return;
          }
        }
    }
}