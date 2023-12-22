import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String ans = "";
        for(int i = 0; i < t.length(); i++) {
            if(t.substring(i,i+1).equals("P")) {
                ans += "P";
            } else {
                ans += "D";
            }
        }
        System.out.println(ans);
    }
}
