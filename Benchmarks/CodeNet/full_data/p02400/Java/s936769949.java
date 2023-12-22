import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double area = Math.PI*Math.pow(r,2);
        double circ = Math.PI*2*r;
        System.out.printf("%f %f\n",area,circ);
    }
}
