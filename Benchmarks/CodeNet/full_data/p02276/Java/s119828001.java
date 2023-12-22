import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = Integer.parseInt(sc.next());

        int q = partition(A, 0, n-1);
        int[] lower = Arrays.copyOfRange(A, 0, q);
        int[] upper = Arrays.copyOfRange(A, q+1, A.length);

        String lowerStr = Arrays.stream(lower).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        String upperStr = Arrays.stream(upper).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(lowerStr + " [" + A[q] + "] " + upperStr);
    }

    private static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i++;
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        int tmp = A[i+1];
        A[i+1] = A[r];
        A[r] = tmp;
        return i+1;
    }
}

