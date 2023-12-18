import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A = Integer.parseInt(scan.next());
        int B = Integer.parseInt(scan.next());
        int C = Integer.parseInt(scan.next());
        int X = Integer.parseInt(scan.next());
        int Y = Integer.parseInt(scan.next());

        long ans1;
        long ans2;
        long ans3;


        if(X == Y){
            ans1 = A * X + B * Y;
            ans2 = C * 2 * X;
            System.out.println( ans1 > ans2 ? ans2:ans1);
            return;
        }

        if(X > Y) {
            ans1 = A * X + B * Y;
            ans2 = C*2*Y + C*2*(X-Y);
            ans3 = C*2*Y + A*(X-Y);

            ans2 = ans2 > ans3 ? ans3:ans2;
            System.out.println( ans1 > ans2 ? ans2:ans1);
            return;
        }

        if(Y > X){
            ans1 = B * Y + A * X;
            ans2 = C*2*X + C*2*(Y-X);
            ans3 = C*2*Y + B*(Y-X);

            ans2 = ans2 > ans3 ? ans3:ans2;
            System.out.println( ans1 > ans2 ? ans2:ans1);
            return;
        }

    }
}