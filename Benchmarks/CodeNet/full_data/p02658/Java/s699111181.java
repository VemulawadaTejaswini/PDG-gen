import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Long result = 1L;
        for(int i = 0; i<N; i++) {
            result *= sc.nextLong();
        }
        if (result > 1000000000000000000L) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
