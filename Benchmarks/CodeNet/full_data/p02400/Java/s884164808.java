
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI=Math.PI;
        double r = sc.nextDouble();
        double s=PI*r*r;
        double R=2*PI*r;
        System.out.printf("%f %f\n",s,R);
        sc.close();
    }
}

