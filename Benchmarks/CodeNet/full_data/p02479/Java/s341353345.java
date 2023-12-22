import java.util.Scanner;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = Math.PI;
        double syu;
        double men;
        syu = (double)a * (double)2 * b;
        men = (double)a * (double)a * b;
        System.out.printf("%f %f", syu, men);
    }
}