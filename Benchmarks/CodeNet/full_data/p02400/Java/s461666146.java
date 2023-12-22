import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double pi = Math.PI;
        double area = r*r*pi;
        double circleLine = 2*r*pi;
        System.out.printf("%f %f",area,circleLine);
        in.close();
    }
}
