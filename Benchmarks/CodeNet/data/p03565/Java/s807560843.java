import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int indexT = t.length()-1;
        int ansIndex = -1;
        for(int indexS = s.length()-1; indexS >= 0; indexS--) {
            if(indexT == 0 && (s.charAt(indexS) == t.charAt(indexT) || s.charAt(indexS) == '?')) {
                ansIndex = indexS;
                break;
            }
            if(s.charAt(indexS) != '?' && s.charAt(indexS) != t.charAt(indexT)) {
                indexT = t.length()-1;
            } else {
                indexT--;
            }
        }
        if(ansIndex != -1) {
            String answer = s.substring(0, ansIndex) + t;
            if(ansIndex + t.length() < s.length()) {
                answer += s.substring(ansIndex + t.length(), s.length());
            }
            System.out.println(answer.replaceAll("\\?", "a"));
        } else {
            System.out.println("UNRESTORABLE");
        }
    }
}
