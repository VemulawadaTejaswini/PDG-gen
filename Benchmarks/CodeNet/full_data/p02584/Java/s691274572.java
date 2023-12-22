import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X = Long.parseLong(scanner.next());
        long K = Long.parseLong(scanner.next());
        long D = Long.parseLong(scanner.next());
        long div = 0;
        long left = 0;
        long right = 0;
        scanner.close();

        X = Math.abs(X);
        div = X / D;

        if (div > K){
            X -= K * D; 
        } else {
            X -= div * D;
            left = D - X;
            right = X;

            if ((K - div) % 2 == 0){
                X = right;
            } else {
                X = left;
            }
        }
        
        System.out.println(Math.abs(X));
    }
}


