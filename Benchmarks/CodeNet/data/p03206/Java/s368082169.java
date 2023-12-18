
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int d = 25 - sc.nextInt();
        String s = "Christmas";
        for (int i = 0; i < d; i++) {
            s += " Eve";
        }
        System.out.println(s);
    }

}
