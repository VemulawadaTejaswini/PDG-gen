import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long currentA = 1;
        double baseNum = Math.pow(10, 18);
        long[] vals = new long[N];
        for (int i = 0; i < N; i++) {
            vals[i] = sc.nextLong();
        }
        Arrays.sort(vals);
        if (vals[0] == 0) {
            System.out.println(0);
        } else {
            for (int i = 0; i < N; i++) {
                currentA *= vals[i];
                if (currentA > baseNum) {
                    currentA = -1;
                    break;
                }
            }
            System.out.println(currentA == 0 ? -1 : currentA);
        }

    }
}