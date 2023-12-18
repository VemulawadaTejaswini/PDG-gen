import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong(); // S piece
        long M = scan.nextLong(); // C piece
        
        long count = 0;
        if(N * 2  > M) {
            System.out.println(N / 2);
        } else {
            System.out.println(N + (M - N * 2) / 4);
        }
    }
}
