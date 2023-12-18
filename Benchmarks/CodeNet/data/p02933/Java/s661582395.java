import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        int a = inp.nextInt();
        String s = inp.next();
        System.out.println(a < 3200 ? "red" : s);
    }
}
