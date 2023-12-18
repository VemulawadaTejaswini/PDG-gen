import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        Arrays.sort(s);
        for (int i = 0; i < s.length - 1; i++) {
            if (!s[i].equals(s[i + 1])) {
                continue;
            }
            System.out.println("no");
            return;
        }
        System.out.println("yes");
    }

}
