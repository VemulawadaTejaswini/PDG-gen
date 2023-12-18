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

        List<Integer> B = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                B.add(A[i]);
            }
        }

        boolean result = false;
        if (B == null) {
            System.out.println("DENIED");
        } else {
            for (int i = 0; i < B.size(); i++) {
                if (B.get(i) % 3 == 0 || B.get(i) % 5 == 0) {
                    result = true;
                } else {
                    result = false;
                    System.out.println("DENIED");
                    break;
                }
            }
        }
        if (result == true) {
            System.out.println("APPROVED");
        }
    }
}