import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] c = s.toCharArray();

        Arrays.sort(c);
        char a = 'a';
        if (a == c[0])
            a++;
        else {
            System.out.println(a);
            System.exit(0);
        }
        for (int i = 1; i < c.length; i++) {
            if (a == c[i]) {
                a++;
            } else if (c[i] == c[i-1]) {
                continue;
            } else {
                System.out.println(a);
                System.exit(0);
            }
        }
        
        System.out.println("None");
    }
}
