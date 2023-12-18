import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        System.out.println((int)Math.floor(x / 3));
        inp.close();
    }
}