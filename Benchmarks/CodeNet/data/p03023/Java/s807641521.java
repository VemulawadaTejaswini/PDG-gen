import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();

	}
}


class Solve{


	 public void solve() {
		 Scanner sc = new Scanner(System.in) ;
		 int N = sc.nextInt();
		 
		 
		 System.out.println(180*(N-2));

		
	 }
}