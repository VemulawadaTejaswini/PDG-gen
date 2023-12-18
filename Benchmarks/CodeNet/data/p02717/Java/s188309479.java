import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = IntStream.range(0, N).map(i -> sc.nextInt()).toArray();

        int all_point = Arrays.stream(A, 0, N).sum();
        int point = all_point / (4 * M);
        int count = (int) IntStream.range(0, N).filter(i -> A[i] > point).count();
        if (M <= count) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}