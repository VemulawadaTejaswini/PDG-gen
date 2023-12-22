import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        final int ANGLE_PER_HOUR = 30;
        final int ANGLE_PER_MINUTE = 6;

        int angleHour = h * ANGLE_PER_HOUR;
        int angleMinute = m * ANGLE_PER_MINUTE;

        int eggplantAngle = 0;
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
