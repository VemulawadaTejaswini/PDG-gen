import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int g = 0;
        int p = 0;
        for (int i=0;i<N;i++) {
            if (S.charAt(i)=='g') g++;
            else p++;
        }
        System.out.println(N/2-p);
    }
}