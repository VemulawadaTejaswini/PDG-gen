import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();

        //double result = (Math.log10(X) - 2) / Math.log10(1.01);

        int result=100;

        for (int i = 0; ; i++) {
            if (result>=X) {
                System.out.println(i);
                break;
            }
            result+=result/100;
        }
    }
}