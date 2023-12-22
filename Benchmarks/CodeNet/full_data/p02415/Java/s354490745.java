import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Collections;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            String s = sc.next();
            
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if (Character.isLetter(c)) {
                    if (Character.isUpperCase(c)) {
                        c = Character.toLowerCase(c);
                    } else {
                        c = Character.toUpperCase(c);
                    }
                }
                sb.append(c);
            }
            sb.append(" ");
        }
        
        sb.delete(sb.length()-1, sb.length());
        System.out.println(sb);
    }
}