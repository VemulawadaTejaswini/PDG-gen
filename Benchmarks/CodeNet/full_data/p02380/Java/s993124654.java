import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double cr = c*Math.PI/180;

        System.out.println(0.5*a*b*Math.sin(cr));
        System.out.println(a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(cr)));
        System.out.println(b*Math.sin(cr));
    }
}
