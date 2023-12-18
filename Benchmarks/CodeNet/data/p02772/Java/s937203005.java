import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = stdIn.nextInt();
        }
        stdIn.close();

        String result = "";
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                if (A[i] % 3 == 0 || A[i] % 5 == 0) {
                    result = "APPROVED";
                    break;
                } else {
                    result = "DENIED";
                    break;
                }
            } else {
                result = "DENIED";
            }
        } 
        System.out.println(result);

    }
}