import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int time = hour * 60 + minute;

        double[] aPosition = new double[2];
        double[] bPosition = new double[2];

        double shortRad = 2.0 * Math.PI * (double)time / (60.0 * 12.0);
        double longRad = 2.0 * Math.PI * (double)time / 60.0;


        aPosition[0] = A * Math.sin(shortRad);
        aPosition[1] = A * Math.cos(shortRad);

        bPosition[0] = B * Math.sin(longRad);
        bPosition[1] = B * Math.cos(longRad);

        double distance;
        distance = Math.sqrt((aPosition[0] - bPosition[0])*(aPosition[0] - bPosition[0]) + (aPosition[1] - bPosition[1])*(aPosition[1] - bPosition[1]));
        System.out.println(distance);
    }
}