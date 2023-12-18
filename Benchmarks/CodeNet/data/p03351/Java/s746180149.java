import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();
        boolean if1 = Math.abs(a - c) <= d;
        boolean if2 = Math.abs(a - b) <= d;
        boolean if3 = Math.abs(b - c) <= d;
        if (if1 || if2 && if3) System.out.println("Yes");
        else System.out.println("No");
        inp.close();
    }
}
