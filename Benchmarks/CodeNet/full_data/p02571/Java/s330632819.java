import java.util.*;

public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int max = 0;
        for (int i = 0; i < S.length(); i++) {
            for(int j = i+T.length(); j < S.length(); j++) {
                String now = S.substring(i, j);
                int count = 0;
                for (int k = 0; k < T.length(); k++) {
                    if (T.charAt(k) == now.charAt(k)) {
                        count++;
                    }
                }
                max = Math.max(max, count);
            }
        }
        System.out.println(T.length()-max);
    }
}
