import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String DERAM = "dream";
        String DERAMER = "dreamer";
        String ERASE = "erase";
        String ERASER = "eraser";

        while (s.length() >= 5) {
            if (DERAM.equals(s.substring(s.length()-DERAM.length()))) {
                s = s.substring(0, s.length()-DERAM.length());
            } else if (DERAMER.equals(s.substring(s.length()-DERAMER.length()))) {
                s = s.substring(0, s.length()-DERAMER.length());
            } else if (ERASE.equals(s.substring(s.length()-ERASE.length()))) {
                s = s.substring(0, s.length()-ERASE.length());
            } else if (ERASER.equals(s.substring(s.length()-ERASER.length()))) {
                s = s.substring(0, s.length()-ERASER.length());
            } else {
                System.out.println("No");
                return;
            }
        }
        if (s.length() == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}