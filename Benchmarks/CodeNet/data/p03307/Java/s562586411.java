import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        if (a % 2 == 0) System.out.println(a);
        else System.out.println(a * 2);
        inp.close();
    }
}
