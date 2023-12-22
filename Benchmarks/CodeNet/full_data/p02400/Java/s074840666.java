import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.printf("%f %f",((a+a)*Math.PI),(a*a*Math.PI));
        sc.close();
    }
}

