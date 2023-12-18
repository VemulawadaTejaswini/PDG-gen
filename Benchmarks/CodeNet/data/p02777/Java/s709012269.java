import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        String[] second = br.readLine().split(" ", 2);
        int a = Integer.parseInt(second[0]);
        int b = Integer.parseInt(second[1]);
        String third = br.readLine();
        if (third.equals(first[0])) {
            a--;
        } else {
            b--;
        }
        System.out.println(a + " " + b);
    }
}