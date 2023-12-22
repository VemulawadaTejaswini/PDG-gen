import java.util.Scanner;
import java.math.*;

class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longHand = sc.nextInt();
        int shortHand = sc.nextInt();
        int hour = sc.nextInt();
        int minutes = sc.nextInt();

        double hourAngle = 360 * hour / 12;
        double minutesAngle = 360 * minutes / 60;
        double angleDiff = hourAngle - minutesAngle;
        double cosine = Math.cos(Math.toRadians(angleDiff));

        double squrt = longHand * longHand + shortHand * shortHand - 2 * longHand * shortHand * cosine;
        double answer = Math.sqrt(squrt);

    
        System.out.println(answer);
    }
}