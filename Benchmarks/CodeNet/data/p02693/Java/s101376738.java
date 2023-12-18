import java.util.*;

public class D {

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (b - a + 1 >= k) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}



