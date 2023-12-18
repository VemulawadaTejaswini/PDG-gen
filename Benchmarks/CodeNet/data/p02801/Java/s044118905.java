import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        char s = inp.next().toCharArray()[0];
        System.out.println((char)(((int)s)+1));
    }
}