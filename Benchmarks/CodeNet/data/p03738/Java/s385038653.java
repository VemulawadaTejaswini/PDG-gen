
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
        if (a.length() > b.length()) {
            System.out.println("GREATER");
        } else if (a.length() < b.length()) {
            System.out.println("LESS");
        } else if (a.equals(b)) {
            System.out.println("EQUAL");
        }
        bw.flush();
    }
}
