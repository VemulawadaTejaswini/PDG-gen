import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(solve(N));
    }

    static String solve(int N) {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 25; j++) {
                if( i * 7 + j * 4 == N ) {
                    return "Yes";
                }
            }
        }
        return "No";
    }
}
