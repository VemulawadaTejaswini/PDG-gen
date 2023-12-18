import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String A[] = new String[N];
        for (int i=0; i<N; i++) {
            A[i] =  sc.next();
        }
        sc.close();

        BigInteger left_length = new BigInteger(A[0]);
        BigInteger right_length = new BigInteger(A[N-1]);
        int left_cnt = 1;
        int right_cnt = 1;
        while (left_cnt+right_cnt<N) {
            if (left_length.compareTo(right_length)==0) {
                if (Long.parseLong(A[left_cnt])<Long.parseLong(A[N-1-right_cnt])) {
                    left_cnt++;
                    left_length = left_length.add(new BigInteger(A[left_cnt-1]));
                } else {
                    right_cnt++;
                    right_length = right_length.add(new BigInteger(A[N+1-right_cnt]));
                }
            } else if (left_length.compareTo(right_length)<0) {
                left_cnt++;
                left_length = left_length.add(new BigInteger(A[left_cnt-1]));
            } else {
                right_cnt++;
                right_length = right_length.add(new BigInteger(A[N+1-right_cnt]));
            }
        }
        System.out.println(Math.abs(left_length.subtract(right_length).intValue()));
    }
}