import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 
class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = in.nextLine(); // Scanner has functions to read ints, longs, strings, chars, etc.

        System.out.println((char) (s.charAt(0) + 1));
    }
}