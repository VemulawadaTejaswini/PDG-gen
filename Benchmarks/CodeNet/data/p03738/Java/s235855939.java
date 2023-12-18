import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ans = "";
        if (a.length() > b.length()) {
            ans = "GREATER";
        } else if (a.length() < b.length()) {
            ans = "less";
        } else {
            for (int i=0; i<a.length();i++) {
                int an = Integer.parseInt(a.substring(i,i+1));
                int bn = Integer.parseInt(b.substring(i,i+1));
                if (an > bn) {
                    ans = "GREATER";
                    break;
                } else if (an < bn) {
                    ans ="LESS";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}