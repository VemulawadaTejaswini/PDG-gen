
import java.io.*;
import java.util.*;
//import java.util.stream.*;;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        String s = br.readLine();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                str.append("0");
            } else if (s.charAt(i) == '1') {
                str.append("1");
            } else if (str.length() - 1 >= 0 && str.toString() != null) {
                str.deleteCharAt(str.length() - 1);
            }
        }
        System.out.println(str.toString());
        bw.flush();
    }
}
