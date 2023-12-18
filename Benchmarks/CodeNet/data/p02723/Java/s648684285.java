import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        char s[] = inp.next().toCharArray();
        if (s[2] == s[3] && s[4] == s[5]) System.out.println("Yes");
        else System.out.println("No");
    }
}
