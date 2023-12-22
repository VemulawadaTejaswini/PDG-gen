import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for (int ii = 1; ; ii++) {
            String line = br.readLine();
            int a = Integer.parseInt(line);
            if (a == 0) {
                break;
            }
            System.out.println("Case " + ii + ": " + a);
        }
    }
}