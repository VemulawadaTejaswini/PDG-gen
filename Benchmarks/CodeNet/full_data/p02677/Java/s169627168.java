import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double a_angle = (h * 60 + m) / (12.0 * 60) * 360 ;
        double b_angle = m / (60.0) * 360;

        double angle = a_angle - b_angle;

        System.out.println(Math.sqrt((a * a) + (b * b) - (2 * a * b) * Math.cos(Math.toRadians(angle))));

    }
}
