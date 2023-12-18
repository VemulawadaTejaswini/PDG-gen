import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();
        int ab = a * b;
        int cd = c * d;
        System.out.println(max(ab, cd));
    }
    public static int max(int x, int y) {
        if (x > y) return x;
        return y;
    }
}