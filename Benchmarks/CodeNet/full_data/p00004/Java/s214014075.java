import java.util.Scanner;


class Main{
    public static void main(String[] args){
        double EPS = 1e-6;
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            double d = in.nextDouble();
            double e = in.nextDouble();
            double f = in.nextDouble();
            double x = (e * c - b * f) / (a * e - b * d);
            double y = (- c * d + a * f) / (a * e - b * d);
            System.out.printf("%.3f %.3f\n", x+EPS, y+EPS);
        }
    }
}