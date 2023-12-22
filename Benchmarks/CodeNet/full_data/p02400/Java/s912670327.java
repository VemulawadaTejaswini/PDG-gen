import java.util.*;

public class Main{
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        double r =sc.nextDouble();
        double one = r*r*Math.PI;
        double two = 2*r*Math.PI;
        System.out.printf("%f %f\n", one, two);
    }
}
