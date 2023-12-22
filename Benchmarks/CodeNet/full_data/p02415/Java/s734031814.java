import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length();
        String ans = "";
        for(int i = 0; i < l; i++) {
            char c = str.charAt(i);
            if(Character.isUpperCase(c)) {
                ans += String.valueOf(Character.toLowerCase(c));
            } else if(Character.isLowerCase(c)) {
                ans += String.valueOf(Character.toUpperCase(c));
            } else {
                ans += String.valueOf(c);
            }
        }
        System.out.println(ans);
    }
}
