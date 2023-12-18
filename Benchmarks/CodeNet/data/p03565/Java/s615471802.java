import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int sN = s.length;
        int tN = t.length;
        
        boolean isReplaced = false;
        for(int i = sN - 1;i >= 0;i--) {
            char featured = s[i];
            if((i - tN + 1) >= 0 && s[i - tN + 1] == t[0] && !isReplaced) {
                boolean isPossible = true;
                for(int j = 0;j < tN - 1;j++) {
                    if(s[i - j] != '?' && s[i - j] != t[tN - 1 - j]) {
                        isPossible = false;
                        break;
                    }
                }
                if(isPossible) {
                    for(int j = 0;j < tN - 1;j++) s[i - j] = t[tN - 1 - j];
                    isReplaced = true;
                }
                else {
                    for(int j = 0;j < t.length - 1;j++) {
                        if(s[i - j] == '?') s[i - j] = 'a';
                    }
                }
                i -= (tN - 1);
            }
            else if(featured == '?') s[i] = 'a';
        }
        
        if(!isReplaced) s = "UNRESTORABLE".toCharArray(); 
        System.out.println(s);
    }
}
