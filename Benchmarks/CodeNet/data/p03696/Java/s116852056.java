import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int cnt = 0;
        for(int i = n-1; i >= 0; i--) {
            if(s.charAt(i) == ')') {
                cnt++;
            }else if(s.charAt(i) == '(') {
                if(cnt > 0){
                    cnt--;
                }else{
                    s = s + ")";
                }
            }
        }
        for(int i = 0; i < cnt; i++) {
            s = "(" + s;
        }

        print(s);
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