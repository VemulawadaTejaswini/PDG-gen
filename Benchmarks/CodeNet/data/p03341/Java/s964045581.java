import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        long E = 0;
        long W = 0;
        long El = 0;
        long Wl = 0;
        char[] car = S.toCharArray();
        for (char c : car) {
            if (c == 'E') E++;
            else W++;
        }
        long ans = Long.MAX_VALUE;
        for (char c : car) {
            long count = 0;
            if (c == 'E') {
                E--;
                count += (Wl+E);                
                El++;
            } else {
                W--;
                count += (Wl+E);
                Wl++;
            }
            ans = Math.min(ans, count);
        }
        System.out.println(ans);
    }
}