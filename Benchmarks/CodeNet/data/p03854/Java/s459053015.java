import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuffer str = new StringBuffer(S);
        S = str.reverse().toString();
        while(true) {
            if(S.length() >= 5 && S.substring(0, 5).equals("esare")) {
                S = S.substring(5, S.length());
            }else if(S.length() >= 5 && S.substring(0, 5).equals("maerd")) {
                S = S.substring(5, S.length());
            }else if(S.length() >= 7 && S.substring(0, 7).equals("remaerd")) {
                S = S.substring(7, S.length());
            }else if(S.length() >= 6 && S.substring(0, 6).equals("resare")) {
                S = S.substring(6, S.length());
            }else {
                break;
            }
        }
        if(S.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}