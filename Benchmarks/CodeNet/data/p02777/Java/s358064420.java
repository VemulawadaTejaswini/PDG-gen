import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        String t = inp.next();
        int a = inp.nextInt();
        int b = inp.nextInt();
        String u = inp.next();
        if (s.equals(u)) {
            System.out.printf("%d %d", a - 1, b);
        }
        else {
            System.out.printf("%d %d", a, b - 1);
        }
        System.out.println();
    }
}