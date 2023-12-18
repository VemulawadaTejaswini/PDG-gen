import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int A = scanner.nextInt();
        int B;

        for(int i=0; i<N-1; i++){
            B = scanner.nextInt();
            A = gcd(A, B);
        }

        System.out.println(A);

    }

    private static int gcd(int A, int B){

        if(A < B){
            int C = A;
            A = B;
            B = C;
        }

        if(B == 0){
            return A;
        }

        return gcd(B, A%B);
    }
}
