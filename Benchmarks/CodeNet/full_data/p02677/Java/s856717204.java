import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        final double SHORT_HAND_ANGLE_PER_MINUTE = 0.5;
        final double LONG_HAND_ANGLE_PER_MINUTE = 6;

        double angleHour = (h * 60 + m) * SHORT_HAND_ANGLE_PER_MINUTE;
        double angleMinute = m * LONG_HAND_ANGLE_PER_MINUTE;

        double eggplantAngle = 0;
        if(angleHour <= angleMinute){
            eggplantAngle = angleMinute - angleHour;
        }else{
            eggplantAngle = angleHour - angleMinute;
        }

        if(eggplantAngle > 180){
            eggplantAngle = 360 - eggplantAngle;
        }

        double radian = Math.toRadians(eggplantAngle);

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2 * a * b * Math.cos(radian));
        System.out.println(c);
    }
}
