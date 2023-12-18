import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int cnt=0;
        boolean b=false;
        while (true) {
            if (cnt == s.length()) {
                b = true;
                break;
            }
            if (cnt + 10 <= s.length() && s.substring(cnt, cnt + 11).equals("dreameraser")) {
                cnt += 11;
            }
            else if (cnt + 9 <= s.length() && s.substring(cnt, cnt + 10).equals("dreamerase")) {
                cnt += 10;
            }
            else if (cnt + 6 <= s.length() && s.substring(cnt, cnt + 7).equals("dreamer")) {
                cnt += 7;
            }
            else if (cnt + 4 <= s.length() && s.substring(cnt, cnt + 5).equals("dream")) {
                cnt += 5;
            }
            else if (cnt + 5 <= s.length() && s.substring(cnt, cnt + 6).equals("eraser")) {
                cnt += 6;
            }
            else if (cnt + 4 <= s.length() && s.substring(cnt, cnt + 5).equals("erase")) {
                cnt += 5;
            }
            else {
                break;
            }
        }
        
    }
}