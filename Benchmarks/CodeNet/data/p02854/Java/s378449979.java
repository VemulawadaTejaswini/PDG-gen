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

        long left_lenght = A[0];
        long right_length = A[N-1];
        int left_cnt = 1;
        int right_cnt = 1;
        while (left_cnt+right_cnt<N) {
            if (left_lenght<right_length) {
                left_cnt++;
                left_lenght += A[left_cnt-1];
            } else {
                right_cnt++;
                right_length += A[N+1-right_cnt];
            }
        }
        System.out.println(Math.abs(left_lenght-right_length));

    }
}