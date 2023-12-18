
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        int count = 0, res = 0;
        int count1 = 0, res1 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '-') {
                count++;
            } else {
                count1++;
            }

        }
        System.out.println(-count + count1);

    }
}
