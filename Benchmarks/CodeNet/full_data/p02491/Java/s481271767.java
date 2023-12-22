import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //for (;;) {
            String line = br.readLine();
            String[] ss = line.split(" ");
            int[] ia = {Integer.parseInt(ss[0]),
                        Integer.parseInt(ss[1])};
            float[] fa = {Float.parseFloat(ss[0]),
                        Float.parseFloat(ss[1])};
            System.out.println(ia[0] / ia[1] + " " +
ia[0] % ia[1] + " " +
fa[0] / fa[1]
);
        //}
    }
}