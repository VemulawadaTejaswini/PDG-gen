import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.charAt(0) != 'A') {
            System.out.println("WA");
            return;
        }
        String sub = s.substring(2, s.length()-1);
        int count = 0;
        for (int i = 0; i < sub.length(); i++) {
            if (sub.charAt(i) == 'C') count++;
        }
        if (count != 1) {
            System.out.println("WA");
            return;
        }

        int lcount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).matches("[A-Z]")) lcount++;
        }
        if (lcount != 2) {
            System.out.println("WA");
        } else {
            System.out.println("AC");
        }
    }
}