import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        inp.close();
        if (a * b % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
