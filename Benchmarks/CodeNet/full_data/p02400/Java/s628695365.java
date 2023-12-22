import java.util.*;

public class Main{
    public static void main(String[] args){
        double r, pi;
        pi = Math.PI;
        Scanner s = new Scanner(System.in);
        r = s.nextDouble();
        System.out.println(String.format("%.5f %.5f", r*r*pi, 2*r*pi));
    }
}
