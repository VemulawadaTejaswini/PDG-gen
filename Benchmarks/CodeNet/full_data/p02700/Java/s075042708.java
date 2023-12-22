
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int B = sc.nextInt();

        int C = sc.nextInt();

        int D = sc.nextInt();

        String flag;
        while (true) {
            C -= B;
            if (C <= 0) {
                flag = "t";
                break;
            }
            A -= D;
            if (A <= 0) {
                flag = "a";
                break;
            }
        }
        if (flag.equals("t")) System.out.println("Yes");
        else System.out.println("No");
    }

}
