import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputA = sc.nextInt();
        int inputB = sc.nextInt();

        if (canDivide(inputA, inputB)) {
            System.out.printf("Possible");
        } else {
            System.out.printf("Impossible");
        }
    }

    private static boolean canDivide(int inputA, int inputB) {
        if ((inputA % 3) == 0) {
            return true;
        } else if ((inputB % 3) == 0) {
            return true;
        }

        return (((inputA + inputB) % 3) == 0);
    }
}
