import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main{
    public static void main(String[] args) throws IOException {
        int[] inputs = receiveIntArray(Delimiter.SPACE);
        int num = inputs[0];
        int goal = inputs[1];
        
        println(num * 500 >= goal ? "Yes" : "No");
        flush();
    }



    // 入出力関連
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);
    enum Delimiter {
        NONE(""),
        SPACE(" "),
        DOT("\\."),
        COMMA(",");

        private String regex;
        private Delimiter(String regex) {
            this.regex = regex;
        }
        public String getRegex() { return regex; }
    }

    static String receive() throws IOException { return br.readLine(); }
    static int receiveInt() throws IOException { return Integer.parseInt(br.readLine()); }
    static char receiveChar() throws IOException { return  br.readLine().charAt(0); }
    static char[] receiveCharArray() throws IOException { return  br.readLine().toCharArray(); }
    static int[] receiveIntArray(Delimiter delimiter) throws IOException {
        return Stream.of(br.readLine().split(delimiter.getRegex())).mapToInt(Integer::parseInt).toArray();
    }
    static String[] receiveStringArray(Delimiter delimiter) throws IOException {
        return Stream.of(br.readLine().split(delimiter.getRegex())).toArray(String[]::new);
    }

    static void print(Object obj) { pw.print(obj); }
    static void println(Object obj) { pw.println(obj); }
    static void flush() { pw.flush(); }
}