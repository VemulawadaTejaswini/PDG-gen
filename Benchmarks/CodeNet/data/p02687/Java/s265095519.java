import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String ans = "ARC";

        if (s.equals(ans)) {
            System.out.println("ABC");
        } else {
            System.out.println(ans);
        }
        scn.close();
    }
}