import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int DIV = (int)1e9+7;

        double[] A = new double[N];
        double[] B = new double[N];
        double[] C = new double[N];

        for(int i=0; i<N; i++){
            A[i] = scanner.nextDouble();
        }

        for(int i=0; i<N; i++){
            B[i] = scanner.nextDouble();
        }

        for(int i=0; i<N; i++){
            C[i] = scanner.nextDouble();
        }

        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        long sum = 0;

        for(int i=0; i<N; i++){
            double b = B[i];

            int insertA = Arrays.binarySearch(A, b-1+0.1);
            if(insertA < 0) insertA = ~insertA;

            int insertC = Arrays.binarySearch(C, b+1-0.1);
            if(insertC < 0) insertC = ~insertC;

            sum += (insertA * (N - insertC));
            sum %= DIV;
        }
        System.out.println(sum);

    }
}