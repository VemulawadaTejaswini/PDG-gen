import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        var A = new int[N];
        for(int i=0; i<N; i++)
            A[i] = scanner.nextInt();

        var num = 0;
        for(int i=0; i<N-1; i++) {
            for(int j=1; j<N; j++) {
                if(A[i] % A[j] != 0) {
                    num++;
                    break;
                }
            }
        }

        System.out.println(num);
    }
}