import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        if (a * c <= b) System.out.println(c);
        else System.out.println(b / a);
        inp.close();
    }
}
