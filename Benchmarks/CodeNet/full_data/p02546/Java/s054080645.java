/*
    Written by Kabir Kanha Arora
    @kabirkanha
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder ans = new StringBuilder();
        ans.append(s);
        if (s.charAt(s.length() - 1) == 's') {
            ans.append("es");
        } else {
            ans.append("s");
        }
        System.out.println(ans.toString());
    }

}
