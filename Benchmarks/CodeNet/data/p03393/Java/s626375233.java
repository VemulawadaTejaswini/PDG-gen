import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean[] used = new boolean[26];
        for(char ch: str.toCharArray()) {
            used[ch - 'a'] = true;
        }
        for(int i = 0; i < 26; i++) {
            if(!used[i]) {
                System.out.println(str + (char)('a' + i));
                return;
            }
        }
        for(int i = 0; i < 26; i++) {
            if(str.charAt(i) != (char)('a' + i)) {
                System.out.println(str.substring(0, i) +(char)('a' + i));
                return;
            }
        }
        System.out.println(-1);
    }
}