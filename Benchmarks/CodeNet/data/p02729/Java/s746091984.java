import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int numberOfEvenBalls = n * (n - 1)/2;
        int numberOfOddBalls = m * (m - 1)/2;
        
        System.out.println(numberOfEvenBalls + numberOfOddBalls);

    }
}
