import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int r = scan.nextDouble();
    	double area;
    	double length;
    	double pi=Math.PI;
        area = pi*r*r;
        length = 2*pi*r;

        System.out.printf("%f %f\n",area,length);
}
}