import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        String s = inp.next();
        if (s.contains("AB") || s.contains("BA")) System.out.println("Yes");
        else System.out.println("No");
    }
}
