import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] c = new int[3];
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                c[0]++;
            } else if (s.charAt(i) == 'b') {
                c[1]++;
            } else {
                c[2]++;
            }
        }
        if (s.length() == 1) {
            System.out.println("YES");
        }
        if (s.length() == 2) {
            if (c[0] != 2 && c[1] != 2 && c[2] != 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        int min = Math.min(c[0], Math.min(c[1], c[2]));
        int max = Math.max(c[0], Math.max(c[1], c[2]));
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
