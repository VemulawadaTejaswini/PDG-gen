import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        double H = sc.nextInt();
        double M = sc.nextInt();

        double hRad = -((H/12)*2 + (M/60)/6)*Math.PI;
        double mRad = -(M/60)*2*Math.PI;

        double hX = Math.cos(hRad) * A;
        double hY = Math.sin(hRad) * A;
        double mX = Math.cos(mRad) * B;
        double mY = Math.sin(mRad) * B;

        double distance = Math.sqrt(Math.pow(hX-mX, 2) + Math.pow(hY-mY, 2));

        System.out.println(distance);
    }
}