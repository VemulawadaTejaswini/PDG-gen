import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int l = scn.nextInt();
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int d = scn.nextInt();
            while(a > 0 || b > 0) {
                a -= c;
                b -= d;
                l--;
            }
            System.out.println(l);
        }
    }
}