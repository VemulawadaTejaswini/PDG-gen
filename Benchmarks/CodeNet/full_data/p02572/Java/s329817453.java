import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long[] A = new long[N];
        long sum = 0;
        for (int i = 0; i < A.length; i++){
            A[i] = s.nextLong();
        }

        for(int i = 0; i < A.length; i++){
            for(int j = i + 1; j < A.length; j++){
                sum += (A[i] * A[j])%(1000000007);
                sum = sum%(1000000007);
            }
        }

        System.out.println(sum);
    }
}