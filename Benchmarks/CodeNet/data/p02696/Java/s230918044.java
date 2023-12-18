import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        int X=scan.nextInt();
        double a=Math.floor(A*X/B);
        double b=Math.floor(X/B);
        double bA=A*b;
        int res= (int) (a-bA);
        System.out.println(res);
    }
}