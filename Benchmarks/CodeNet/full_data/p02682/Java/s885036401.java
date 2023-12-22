import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        if(K<=A){
            System.out.print(K);
        }
        else if(K<=A+B){
            System.out.print(A);
        }
        else{
            System.out.print(A-(K-A-B));
        }

    }
}