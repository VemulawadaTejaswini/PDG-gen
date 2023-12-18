import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int C = scan.nextInt();
        String S = scan.next();

        int l[] = new int[N];
        int r[] = new int[N];

        int day = 0;
        int lastL[] = new int[N];
        int lastPos = -1;
        int notAvailable = 0;
        for(int i = 0; i < N; i++) {
            if(S.charAt(i) == 'o' && notAvailable == 0) {
                notAvailable = C;
                l[i] = day++;
                lastL[i] = lastPos;
                lastPos = i;
            } else {
                if(notAvailable != 0)
                    notAvailable--;
                l[i] = day;
                lastL[i] = lastPos;
            }
        }

        day = 0;
        int lastR[] = new int[N];
        lastPos = -1;
        notAvailable = 0;
        for(int i = N-1; i >=0 ; i--) {
            if(S.charAt(i) == 'o' && notAvailable == 0) {
                notAvailable = C;
                r[i] = day++;
                lastR[i] = lastPos;
                lastPos = i;
            } else {
                if(notAvailable != 0)
                    notAvailable--;
                r[i] = day;
                lastR[i] = lastPos;
            }
        }

        for(int i = 0; i < N; i++) {
            if(S.charAt(i) == 'o'){
                int lrc = l[i] + r[i];
                if(i != 0 && i != N-1 && lastR[i]-lastL[i] <= C) lrc--;
                if(lrc >= K) continue;
                os.println(i+1);
            }
        }
    }
}