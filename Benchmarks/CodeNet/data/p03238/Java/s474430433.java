import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        switch (N){
            case 1:
                System.out.println("Hello World.");
                break;
            case 2:
                int A,B;
                A = scanner.nextInt();
                B = scanner.nextInt();
                System.out.println(A + B);
                break;
        }
    }
}