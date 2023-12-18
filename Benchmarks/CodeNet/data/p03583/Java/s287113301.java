import java.util.Scanner;

public class Main {

    private static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for(int a = 1; a <= 3500; a++) {
            for(int b = 1; b <= 3500; b++) {
                double tmp = 4.0/N - 1.0/a - 1.0/b;
                if(tmp <= 0) continue;
                if(isInt(1.0 / tmp)) {
                    int c = (int)(1.0 / tmp);
                    System.out.println(a + " " + b + " " + c);
                    return;
                }
            }
        }
    }

    private static boolean isInt(double a) {
        return (Math.abs(a - (int)a) < 0.00000001);
    }

}
