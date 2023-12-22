import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();
        if ( W >= V) {
            System.out.println("NO");
        } else {
            float c = Math.abs(A - B)/(V - W);
            if( T >= c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}