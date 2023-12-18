
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        String a = br.readLine();
        String b = br.readLine();
        String s = "";
        if (a.length() < b.length()) {
            s = "LESS";
        } else if (a.length() > b.length()) {
            s = "GREATER";
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) < b.charAt(i)) {
                    s = "LESS";
                    break;
                } else if (a.charAt(i) > b.charAt(i)) {
                    s = "GREATER";
                    break;
                } else if (a.charAt(i) == b.charAt(i) && i == a.length() - 1) {
                    s = "EQUAL";
                }
            }
        }
        System.out.println(s);
        bw.flush();
    }
}
