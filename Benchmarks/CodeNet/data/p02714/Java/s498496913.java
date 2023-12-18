import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        long result = 0L;
        result += count(S);
        System.out.println(String.format("%d", result));
    }
    static long count(String S) {
        long result = 0L;
        for(int a=0; a<S.length(); a++) {
            char tmp_a = S.charAt(a);
            for(int b=a+1; b<S.length(); b++) {
                char tmp_b = S.charAt(b);
                if(tmp_b==tmp_a) continue;
                for(int c=b+1; c<S.length(); c++) {
                    if((c-b)==(b-a)) continue;
                    char tmp_c = S.charAt(c);
                    if(tmp_c==tmp_a || tmp_c==tmp_b) continue;
                    result++;
                }
            }
        }
        return result;
    }
}
