
import java.io.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = in.readLine();
            if (s == null) {
                break;
            }
            f(s);
        }
        //*/
    }

    public static void f(String s) {
        int week = Integer.parseInt(s);
        double loan = 100000;
        for (int i = 0; i < week; i++) {
            loan *= 1.05;
        }
        System.out.println(Math.round(loan / 10000) * 10000);
    }
}