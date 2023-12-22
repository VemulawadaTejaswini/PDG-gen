import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        sc.close();

        if(K <= A + B){
            System.out.println(A);
        }else{
            System.out.println(A-(K-A-B));
        }
    }
}