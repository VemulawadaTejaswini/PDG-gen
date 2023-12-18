import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        inp.close();
        System.out.println(Math.min(Math.min(a + b, a + c), b + c));
    }
}