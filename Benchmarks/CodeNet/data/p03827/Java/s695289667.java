
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int N = Input.nextInt();
        String S = Input.next();

        int V = 0;
        int Max = 0;
        for (int I = 0; I < N; I++) {
            if (S.charAt(I) == 'I') {
                V++;
            }
            if (V > Max) {
                Max = V;
            }
            if (S.charAt(I) == 'D') {
                V--;
            }

        }
        System.out.println(Max);
    }
}
