import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();

	}

}

class Solve{
	 Scanner sc = new Scanner(System.in) ;

	 void solve() {

		 double w = sc.nextDouble();
		 double h = sc.nextDouble();
		 double x = sc.nextDouble();
		 double y = sc.nextDouble();

		double res=w*h/2;
		int ans=0;
		if(w/2==x&&h/2==y) {
			ans=1;
		}
		System.out.print(String.format("%.6f", res));
		System.out.println(" "+ans);




	 }
	 }