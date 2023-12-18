import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int K = in.nextInt();
        int result = 0;
        while(K > 0 && A > 0) {
            result++;
            A--;
            K--;
        }
        while(K > 0 && B > 0) {
            B--;
            K--;
        }
        while(K > 0 && C > 0) {
            C--;
            K--;
            result--;
        }
        System.out.println(result);
    }
}
