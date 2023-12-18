import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = new char[4];
        String str = in.next();
        for(int i=0; i<4; i++) {
            s[i] = str.charAt(i);
        }
        Arrays.sort(s);
        System.out.println(s[0]==s[1] && s[2]==s[3] && s[1]!=s[2] ? "Yes" : "No");
    }
}
