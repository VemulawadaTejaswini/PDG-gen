
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
        int n = Integer.parseInt(s);
        int count = 0;
        for(int a = 0; a < 10; a++)
        for(int b = 0; b < 10; b++)
        for(int c = 0; c < 10; c++)
        for(int d = 0; d < 10; d++)
            if (a+b+c+d == n) count++;
        System.out.println(count);
    }
}