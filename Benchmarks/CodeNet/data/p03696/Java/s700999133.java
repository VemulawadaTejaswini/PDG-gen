import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        int current = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < data.length; i++) {
            if (data[i] == '(') {
                current += 1;
            }
            if (data[i] == ')') {
                current -= 1;
            }
            sb.append(data[i]);
            if (current < 0) {
                sb.insert(0, '(');
                current += 1;
            }
        }
        for (int i = 0; i < current; i++) {
            sb.append(')');
        }
        System.out.println(sb.toString());
    }
}
