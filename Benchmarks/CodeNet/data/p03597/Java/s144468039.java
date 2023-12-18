import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a = inp.nextInt();
        inp.close();
        System.out.println(n * n - a);
    }
}