import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        int w = scan.nextInt();
        System.out.println(solve(s, w));
    }
    public static String solve(String s, int w) {
        char[] data = s.toCharArray();
        int length = data.length;
        int count = length / w + (length % w == 0 ? 0 : 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(data[i * w]);
        }
        return sb.toString();
    }
}
