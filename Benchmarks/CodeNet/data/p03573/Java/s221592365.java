import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        if (a == b) System.out.println(c);
        else if (a == c) System.out.println(b);
        else System.out.println(a);
    }
}