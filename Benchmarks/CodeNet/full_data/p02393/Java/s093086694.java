import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author saku
 */
public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader std = new BufferedReader(new InputStreamReader(System.in));
        String[] s = std.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        
        Arrays.sort(s);
        System.out.println(s[0] + " " + s[1] + " " + s[2]);

    }

}