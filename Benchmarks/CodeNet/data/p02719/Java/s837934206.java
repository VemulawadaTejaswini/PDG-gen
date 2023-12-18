import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int min = N;

        while(N != 0){
            if(N - K > 0) {
                N = N - K;
            } else {
                N = 0 - (N - K);
            }
            

            if(min > N) {
                min = N;
            }
            if(min < N) {
                N = min;
                break;
            }
        }
        System.out.println(N);
    }
}