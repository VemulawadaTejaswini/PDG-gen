import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int cnt = 0;
        if(s.charAt(0) == '(') {
            cnt = 1;
        }else{
            cnt = -1;
        }

        int pre = 0;
        int ap  = 0;
        for(int i = 1; i < n; i++) {
            if(s.charAt(i) == '(') {
                if(cnt < 0) {
                    pre += Math.abs(cnt);
                    cnt = 1;
                }else{
                    cnt++;
                }
            }else{
                if(cnt > 0) {
                    ap += cnt - 1;
                    cnt = 0;
                }else{
                   cnt--;
                }
            }
        }

        if(cnt < 0) {
            pre += Math.abs(cnt);
        }else{
            ap += cnt;
        }

        for(int i = 0; i < pre; i++) {
            System.out.print('(');
        }
        System.out.print(s);
        for(int i = 0; i < ap; i++) {
            System.out.print(')');
        }
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(long i) {
        System.out.println(i);
    }
}