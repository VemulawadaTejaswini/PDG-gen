import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] s = new String[2];
        StringBuilder sba = new StringBuilder();
        for (int i = 0; i < b; i++) {
            sba.append(a);
        }
        s[0] = sba.toString();
        StringBuilder sbb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            sbb.append(b);
        }
        s[1] = sbb.toString();
        Arrays.sort(s);
        System.out.println(s[0]);
    }

}
