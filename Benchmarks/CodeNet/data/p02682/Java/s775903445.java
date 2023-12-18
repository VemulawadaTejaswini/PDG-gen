import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        int sum = 0;
        if(K <= A) {
            System.out.println(K);
            return;
        } else {
            sum = A;
            K -= A;
            if(K <= B) {
                System.out.println(sum);
                return;
            } else {
                K -=B;
                if(K > 0) {
                    sum -= K;
                    System.out.println(sum);
                    return;
                }else {
                    System.out.println(sum);
                }
            }
        }



        System.out.println(sum);
    }
}