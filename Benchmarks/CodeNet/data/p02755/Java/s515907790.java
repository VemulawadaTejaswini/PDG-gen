import java.util.*;

// "static void main" must be defined in a public class.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int minA = (int)(A * 12.5);
        int maxA = (int)((A + 1) * 12.5);
        int minB = B * 10;
        int maxB = (B + 1) * 10;

        if(minA < maxB && minA >= minB) {
            System.out.println(minA);
        } else if (minB < maxA && minB >= minA) {
            System.out.println(minB);
        } else{
            System.out.println(-1);
        }

    }
}
