import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()) {
			ORLine l1 = new ORLine(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			ORLine l2 = new ORLine(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			
			if(orthogonal(l1, l2)) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
	}
	
	static boolean orthogonal(ORLine l1, ORLine l2) {
		if(l1.a * l2.a == -l1.b * l2.b) return true;
		else return false;
	}
}

class ORLine{
	double a;
	double b;
	
	ORLine(double xa, double ya, double xb, double yb){
		a = ya - yb;
		b = xb - xa;
	}
}