import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int[] cs = new int[26];
        for (;;) {
        String line = br.readLine();
if (line == null || line.length == 0) {
break;
}
        for (int ii = 0; ii < line.length(); ii++) {
            char c = line.charAt(ii);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            if (!Character.isLowerCase(c)) {
                continue;
            }
            cs[(int)c - (int)'a']++;
        }
        }
        }
        for (int ii = 0, c = (int)'a'; ii < cs.length; ii++, c++) {
            System.out.println((char)c + " : " + cs[ii]);
        }
    }
}