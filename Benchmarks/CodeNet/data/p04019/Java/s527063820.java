import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean[] nwse = new boolean[4];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('N' == c) {
                nwse[0] = true;
            } else if ('W' == c) {
                nwse[1] = true;
            } else if ('S' == c) {
                nwse[2] = true;
            } else {
                nwse[3] = true;
            }
        }
        if (!Boolean.logicalXor(nwse[0], nwse[2])
                && !Boolean.logicalXor(nwse[1], nwse[3])) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
