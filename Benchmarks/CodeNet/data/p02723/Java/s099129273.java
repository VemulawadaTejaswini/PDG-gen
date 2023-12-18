import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        char[] ch = sc.next().toCharArray();
        pw.println(ch[2]==ch[3] && ch[4]==ch[5] ? "Yes" : "No");
        pw.flush();
    }
}