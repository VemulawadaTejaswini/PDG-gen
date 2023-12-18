import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        String ans = (s.equals("ABC") ? "ARC" : "ABC");
        System.out.println(ans);
    }
}