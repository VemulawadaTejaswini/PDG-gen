import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        String s = scan.next();
        char[] data = s.toCharArray();
        data[K-1] = (char) ((int) data[K-1]+32);
        System.out.println(new String(data));
    }
}
