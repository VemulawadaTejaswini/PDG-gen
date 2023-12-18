import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int next = s.charAt(i) + n;
            if (next > 90) {
                next -= 26;
            }
            c[i] = (char)next;
        }
        String result = new String(c);
        System.out.println(result);
        sc.close();
    }
}