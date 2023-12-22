import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double aTheta = 360 * h/12 + 30 * m/60;
        double bTheta = 360 * m/60;
        double subAB = Math.abs(aTheta - bTheta);
        double theta = Math.min(subAB, 360 - subAB);
        double cos = Math.cos(Math.toRadians(theta));
        double ansSq = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * cos;
        double ans = Math.sqrt(ansSq);

        System.out.println(ans);    
    }
}
