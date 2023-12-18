import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String text = scan.next();
        char[] data = text.toCharArray();
        data[5] = ' ';
        data[13] = ' ';
        System.out.println(data);
    }
}