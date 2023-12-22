import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double r = n.nextDouble();
        double area = r*r*Math.PI;
        double length = r*2*Math.PI;
        System.out.println(area+" "+length);
    }
}