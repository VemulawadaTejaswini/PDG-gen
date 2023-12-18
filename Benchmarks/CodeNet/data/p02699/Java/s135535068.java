import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        do_(inp);
        inp.close();
    }
    public static void do_(Scanner inp) {
        int s = inp.nextInt();
        int w = inp.nextInt();
        System.out.println(w >= s ? "unsafe" : "safe");
    }
}
