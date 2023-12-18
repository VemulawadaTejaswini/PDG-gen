import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int priceA = 0;
        int priceB = 0;
        priceA = A * N;
        priceB = B;
        if(priceA > priceB) {
            System.out.println(priceB);
        } else {
            System.out.println(priceA);
        }

    }
}
