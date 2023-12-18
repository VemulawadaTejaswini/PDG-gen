import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        if (A==B) {
            System.out.println(C);
        } else if (B==C) {
            System.out.println(A);
        } else if (A==C){
            System.out.println(B);
        }
    }
}
