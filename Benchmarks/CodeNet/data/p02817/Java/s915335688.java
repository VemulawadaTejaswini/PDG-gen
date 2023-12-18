import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        String a = inp.next();
        String b = inp.next();
        System.out.println(b + a);
    }
}
