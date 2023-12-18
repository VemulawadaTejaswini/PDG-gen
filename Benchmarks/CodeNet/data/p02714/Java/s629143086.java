import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        String[] s = S.split("");
        long r = 0;
        long g = 0;
        long b = 0;
        for(int i=0; i<N; i++) {
            if(s[i].equals("R")) r++;
            if(s[i].equals("G")) g++;
            if(s[i].equals("B")) b++;
        }
        long count = r*g*b;

        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(j+j-i >= N) break;
                if(s[i].equals(s[j])) continue;
                else if(s[i].equals(s[j+j-i]) || s[j].equals(s[j+j-i])) {
                    continue;
                }else count--;
            }
        }
        System.out.println(count);
    }
    static int sa(int a, int c) {
        if(a <= c) return c-a;
        else return a-c;
    }
}
