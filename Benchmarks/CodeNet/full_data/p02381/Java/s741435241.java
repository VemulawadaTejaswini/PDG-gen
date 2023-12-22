import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> S = new ArrayList<Double>();

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                for (int i=0; i<S.size(); i++) {
                    System.out.println(S.get(i));
                }
                break;
            }

            int[] A = new int[n];
            int[] B = new int[n];
            double sum1 = 0;
            double sum2 = 0;
            for (int i=0; i<n; i++) {
                A[i] = sc.nextInt();
                sum1 += A[i];
                sum2 += Math.pow(A[i], 2);
            }
            double s = Math.sqrt(sum2/n - Math.pow(sum1/n, 2));

            S.add(s);

        }


    }
}
