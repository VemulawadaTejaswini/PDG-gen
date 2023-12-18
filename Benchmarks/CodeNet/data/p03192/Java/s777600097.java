import java.io.*;
import java.util.*;


public class Test {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string = in.readLine();
            int amount = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '2') {
                    amount++;
                }
            }
            System.out.println(amount);
        } catch (IOException ex) {

        }
    }
}