import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String[] S = s.split("");
        String[] T = t.split("");
        
        int count = 0;
        
        for(int i = 0; i < S.length; i++) {
            if(S[i].equals(T[i])) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
