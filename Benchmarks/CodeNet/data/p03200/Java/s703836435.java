import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int BN = 0;
        char[] cArray = S.toCharArray();
        int ci = 0;
        for(int i = 0; i<cArray.length;i++) {
            if(cArray[i]=='B') {
                BN++;
            }
        }
        int fb, goalIndex;
        int cnt = 0;
        String sub = S.substring(0);

        while((fb = sub.indexOf('B')) != -1) {
            goalIndex = N-(BN--)-fb;
            cnt = cnt + goalIndex;
            if( fb+1 < N) {
                sub = sub.replaceFirst("B","W");
            }
        }
        System.out.println(cnt);
    }
}