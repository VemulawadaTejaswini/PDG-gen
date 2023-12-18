import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        int min = 1000;
        for(int i=0; i<s.length-2; i++) {
            int n = Integer.parseInt(s[i]+s[i+1]+s[i+2]);
            if(sa(753, n) < min) min = sa(753, n);
        }
        System.out.println(min);
    }
    public static int sa(int a, int b) {
        if(a-b >= 0) return a-b;
        else return b-a;
    }
}
