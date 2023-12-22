import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for (;;) {
        String line = br.readLine();
        String[] ss = line.split(" ");
        if (ss[1].equals("?")) {
            break;
        }
        int a = Integer.parseInt(ss[0]);
        int b = Integer.parseInt(ss[2]);
        int ans = 0;
        if (ss[1].equals("+")) {
            ans = a + b;
        } else if (ss[1].equals("-")) {
            ans = a - b;
        } else if (ss[1].equals("*")) {
            ans = a * b;
        } else if (ss[1].equals("/")) {
            ans = a / b;
        }
        System.out.println(ans);
        }
    }
}