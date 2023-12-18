import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] s = st.nextToken().toCharArray();
        for (int i = 0, j = s.length-1; i <= j; i++, j--) {
            if (s[i] == s[j]) continue;
            else {
                System.out.println("No");
                return;
            }
        }
        for (int i = 0, j = (s.length - 2) / 2; i <= j; i++, j--) {
            if (s[i] == s[j]) continue;
            else {
                System.out.println("No");
                return;
            }
        }
        for (int i = (s.length + 1) / 2, j = s.length - 1; i <= j; i++, j--) {
            if (s[i] == s[j]) continue;
            else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write("\n");
//        bw.close();
    }

}