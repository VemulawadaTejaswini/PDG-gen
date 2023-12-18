import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int O = scanner.nextInt();
        int T = scanner.nextInt();
        int J = scanner.nextInt();
        int L = scanner.nextInt();
        int S = scanner.nextInt();
        int Z = scanner.nextInt();

        int result = I+O+J+L;
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

    static boolean isEven(int i) {
        return i%2==0;
    }
}