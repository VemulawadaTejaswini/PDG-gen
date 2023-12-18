import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long I = scanner.nextLong();
        long O = scanner.nextLong();
        long T = scanner.nextLong();
        long J = scanner.nextLong();
        long L = scanner.nextLong();
        long S = scanner.nextLong();
        long Z = scanner.nextLong();

        long result = I+O+J+L;
        if ((isEven(I)&&isEven(J)&&isEven(L))||(!isEven(I)&&!isEven(J)&&!isEven(L)))
            System.out.println(result);
        else {
            if (!isEven(I))
                result--;
            if (!isEven(J))
                result--;
            if (!isEven(L))
                result--;
            System.out.println(result);
        }
    }

    static boolean isEven(long i) {
        return i%2==0;
    }
}