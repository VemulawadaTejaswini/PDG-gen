import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String[] s = S.split("");
        String[] t = T.split("");
        
        boolean hantei = false;
        int count = 0;
        for(int i=0; i<s.length; i++) {
            if(s[i].equals(t[count]) || s[i].equals("?")) {
                count++;
            }else {
                count = 0;
            }
            if(count == t.length) {
                int x = 0;
                for(int j=i-count+1; j<=i; j++) {
                    s[j] = t[x];
                    x++;
                }
                hantei = true;
                break;
            }
        }
        if(hantei) {
            StringBuilder ans = new StringBuilder();
            for(int i=0; i<s.length; i++) {
                if(s[i].equals("?")) ans.append("a");
                else ans.append(s[i]);
            }
            System.out.println(String.valueOf(ans));
        }else {
            System.out.println("UNRESTORABLE");
        }
    }
}