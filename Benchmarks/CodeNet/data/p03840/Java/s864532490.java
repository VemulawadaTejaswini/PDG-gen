import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long I = scanner.nextInt();
        long O = scanner.nextInt();
        int T = scanner.nextInt();
        long J = scanner.nextInt();
        long L = scanner.nextInt();
        int S = scanner.nextInt();
        int Z = scanner.nextInt();

        long result = I+O+J+L;
        if ((isEven(I)&&isEven(J)&&isEven(L)||(!isEven(I)&&!isEven(J)&&!isEven(L))))
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