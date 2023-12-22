import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String f = in.next();
        int t = a.length();
        int k = f.length();
        int h = 0;

        for (int i = 0; i < t; i++) {
            if (a.charAt(i) == f.charAt(i) && (t - (k - 1) == 0)) {
                h++;
            }


        }


        if (h == t) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}









