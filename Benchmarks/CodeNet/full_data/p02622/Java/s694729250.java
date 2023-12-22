import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int c = 0;
        for (int i = 0 ; i < s.length ; i++) {
            if (s[i] != t[i]) {
                c++;
            }
        }
        System.out.println(c);
    }

}
