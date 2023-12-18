import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);

        String s;
        char schar[] = new char[10];

        s = sc.next();
        
        for (int i = 0; i < s.length(); i++) {
            schar[i] = s.charAt(i);
        }

        char schar_out[] = new char[s.length()];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (schar[i] == 'B') {
                if (j != 0) {
                    j--;
                    schar_out[j] = '\0';
                }
            } else {
                schar_out[j] = schar[i];
                j++;
            }

        }
        
        String sstring_out = new String(schar_out);
        out.println(sstring_out.trim());
        sc.close();
    }
}