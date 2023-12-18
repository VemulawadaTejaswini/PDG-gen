import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == b) {
                System.out.println(a+b);
            } else if (a > b) {
                System.out.println(a + a - 1);
            } else {
                System.out.println(b + b - 1);
            }
        } catch (IOException ex) {

        }
    }

}