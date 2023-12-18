import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int x = inp.nextInt();
        if (a <= x && x <= a + b) System.out.println("YES");
        else System.out.println("NO");
        inp.close();
    }
}
