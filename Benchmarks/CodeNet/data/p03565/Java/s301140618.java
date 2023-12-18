import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int sN = s.length;
        int tN = t.length;
        
        boolean isReplaced = false;
        for(int i = 0;i < sN;i++) {
            char featured = s[i];
            if(featured == t[0] && i + tN <= sN) {
                boolean isPossible = true;
                for(int j = 1;j < t.length - 1;j++) {
                    if(s[i + j] != '?') {
                        isPossible = false;
                        break;
                    }
                }
                if(isPossible) {
                    for(int j = 1;j < t.length;j++) s[i + j] = t[j];
                    i = i + tN;
                    isReplaced = true;
                }
            }
        }
        
        if(isReplaced) {
            for(int i = 0;i < sN;i++) {
                if(s[i] == '?') s[i] = 'a';
            }
        }
        else {
            s = "UNRESTORABLE".toCharArray(); 
        }
        System.out.println(s);
    }
}
