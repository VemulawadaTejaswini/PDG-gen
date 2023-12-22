import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\\D");
		int a,b;
		double x,y;
		int ax = 0,by = 0;
		while (sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			x = Math.cos(Math.PI * b / 180) * a;
			y = Math.sin(Math.PI * b / 180) * a;
			ax += x; 
			by += y;
		}
		System.out.println(ax + "/n" + by);
	}
}