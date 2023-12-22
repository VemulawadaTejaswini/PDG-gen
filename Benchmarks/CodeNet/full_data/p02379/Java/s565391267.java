import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j, k;
    	
    	double x1 = sc.nextDouble();
    	double y1 = sc.nextDouble();
    	double x2 = sc.nextDouble();
    	double y2 = sc.nextDouble();
    	
    	System.out.println(Math.hypot(x2 - x1, y2 - y1));
    }
}
