import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int a = inp.nextInt();
        int b = inp.nextInt();
        int xa = Math.abs(x - a);
        int xb = Math.abs(x - b);
        if (xa < xb) System.out.println("A");
        else System.out.println("B");
    }
}