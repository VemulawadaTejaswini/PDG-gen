import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean ans = solve(N);
        System.out.println(ans? "Yes" : "No");
    }

    private static boolean solve(int N) {
        int sn = 0;

        int value = N;
        while (value > 0) {
            sn += value %10;
            value /= 10;
        }


        return N%sn == 0;
    }

}
