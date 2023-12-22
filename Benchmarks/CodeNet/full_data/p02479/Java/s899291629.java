import java.util.*;

class Main{
    public static final double PI = 3.14159265;
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	double r = s.nextDouble();
	double area = r * r * PI + 0.0000004;
	double circle = 2 * r * PI + 0.0000004;
	
	System.out.println(area + " " + circle);
    }
}