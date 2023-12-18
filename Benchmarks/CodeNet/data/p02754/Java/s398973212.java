import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split(" ");
        long N = Long.parseLong(S[0]);
        long A = Long.parseLong(S[1]);
        long B = Long.parseLong(S[2]);
        sc.close();

        long time = N / (A + B);
        long times = N % (A + B);

        if (times > A) {
            times = A;
        }

        long blueCount = time * A + times;
        System.out.println(blueCount);

    }

}
