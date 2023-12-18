//agc033_b
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt(), N = sc.nextInt();
        int Sr = sc.nextInt(), Sc = sc.nextInt();
        String S = sc.next(), T = sc.next();
        sc.close();

        HashMap<String, Integer> T_Kun = new HashMap<>(),
                                 A_Kun = new HashMap<>();
        for (int n = 0; n < 4; n++) {
            String ch = String.valueOf("LRUD".charAt(n)); 
            T_Kun.put(ch, 0);
            A_Kun.put(ch, 0);
        }
        for (int n = 0; n < N; n++) {
            int c;
            c = T_Kun.get(String.valueOf(S.charAt(n)));
            T_Kun.put(String.valueOf(S.charAt(n)), ++c);
            c = A_Kun.get(String.valueOf(T.charAt(n)));
            A_Kun.put(String.valueOf(T.charAt(n)), ++c);
        }
        int  left = Sc - T_Kun.get("L") + A_Kun.get("R");
        int  right = Sc + T_Kun.get("R") - A_Kun.get("L");
        int  up = Sr - T_Kun.get("U") + A_Kun.get("D");
        int  down = Sr + T_Kun.get("D") - A_Kun.get("U");
        boolean ans = false;
             if (left < 0) ans = true;
        else if (right >= W) ans = true;
        else if (up < 0) ans = true;
        else if (down >= H) ans = true;
        System.out.println(ans ? "YES": "NO");
    }
}