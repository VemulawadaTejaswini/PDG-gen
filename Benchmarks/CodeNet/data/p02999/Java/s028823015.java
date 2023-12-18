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
		 int x = sc.nextInt();
		 int a = sc.nextInt();
		 
		 if(x<a) {
			 System.out.println(0);
		 }else {
			 System.out.println(10);
		 }
	 }




	 }