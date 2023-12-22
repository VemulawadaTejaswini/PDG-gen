import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        String s = Long.toString(n, 26);
        String[] strArray = s.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int num = Integer.parseInt(strArray[i], 26) - 1;
            sb.append((char)('a' + num));
        }
        System.out.println(sb.toString());
    }
}