import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str;
        int count = 0;
        str = s.split("");
        if (!str[0].equals("A")) {
            System.out.println("WA");
            System.exit(0);
        }
        for (int i = 2; i <= str.length - 2; i++) {
            if (Character.isLowerCase(s.charAt(i))) {
            } else {
                if (str[i].equals("C")) {
                    count++;
                } else {
                    System.out.println("WA");
                    System.exit(0);
                }
            }
        }
        if (Character.isLowerCase(s.charAt(1))) {
        } else {
            System.out.println("WA");
            System.exit(0);
        }
        if (Character.isLowerCase(s.charAt(str.length - 1)) && count == 1) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}