import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double ans = A*B;
        System.out.println(Math.round(Math.floor(ans)));
    }
}
