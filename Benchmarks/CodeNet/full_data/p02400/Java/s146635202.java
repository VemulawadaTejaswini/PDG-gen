import java.util.Scanner;
import java.text.DecimalFormat;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat d1 = new DecimalFormat("0.000000");

        double r = scanner.nextInt();
        double pi = Math.PI;

        System.out.println(d1.format(r*r*pi)+" "+d1.format(2*r*pi));

    }
}

