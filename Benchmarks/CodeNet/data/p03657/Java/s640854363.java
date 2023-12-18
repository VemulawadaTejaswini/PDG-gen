import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        inp.close();
        if ((a + b) % 3 == 0) {
            System.out.println("Possible");
        }
        else if (a % 3 == 0) {
            System.out.println("Possible");
        }
        else if (b % 3 == 0) {
            System.out.println("Possible");
        }
        else {
            System.out.println("Impossible");
        }
    }
}