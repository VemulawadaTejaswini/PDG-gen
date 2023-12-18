import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long A[] = new long[N];
        for (int i=0; i<N; i++) {
            A[i] =  Long.parseLong(sc.next());
        }
        sc.close();

        long left_length = 0;
        long right_length = Arrays.stream(A).sum();
        long min = Long.MAX_VALUE;
        for (int i=0; i<N; i++) {
            left_length += A[i];
            right_length -= A[i];
            min = Math.min(min, Math.abs(left_length - right_length));
        }
        System.out.println(min);
    }
}