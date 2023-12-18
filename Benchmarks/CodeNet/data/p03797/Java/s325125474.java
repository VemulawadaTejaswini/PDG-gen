import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong(); // S piece
        long M = scan.nextLong(); // C piece
        
        if(N * 2  > M) {
            System.out.println(M / 2);
        } else {
            System.out.println(N + (M - N * 2) / 4);
        }
    }
}
