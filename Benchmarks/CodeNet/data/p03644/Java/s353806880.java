import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        boolean check = true;
        if (N >= 2) {
            while (N > 0) {
                ans++;
                N = N / 2;
            }
        } else {
            check = false;
        }
        if (check == false) {
            System.out.println(N);
        } else {
            System.out.println((int)Math.pow(2,(ans - 1)));
        }
    }

}