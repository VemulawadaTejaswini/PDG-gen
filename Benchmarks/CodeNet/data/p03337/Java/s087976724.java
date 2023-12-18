import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        System.out.println(max(a + b, a - b, a * b));
        inp.close();
    }
    public static int max(int... args) {
        int r = args[0];
        int s = 0;
        for (int i = 1; i < args.length; i++) {
            s = Math.max(args[i - 1], args[i]);
            if (s >= r) r = s;
        }
        return r;
    }
}
