import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        String tmp = "";

        tmp = S.replace("R", "");
        int r = N - tmp.length();
        tmp = S.replace("G", "");
        int g = N - tmp.length();
        tmp = S.replace("B", "");
        int b = N - tmp.length();
        long max = r * g * b;

        long cnt = 0;
        int k = 0;
        
        for(int j = 2; j <= N - 1; j++) {
            for(int i = 1; i < j; i++) {
                k = (2 * j) - i;
                if(k <= N) {
                    if(S.charAt(i - 1) != S.charAt(j - 1) && S.charAt(j - 1) != S.charAt(k - 1) && S.charAt(i - 1) != S.charAt(k - 1)) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(max - cnt);
    }
}