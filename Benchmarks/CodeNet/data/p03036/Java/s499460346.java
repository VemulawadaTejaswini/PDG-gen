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
		 int r =sc.nextInt();
		 int D =sc.nextInt();
		 int x_2000 =sc.nextInt();
		 int[] x_res = new int[10];
		 
		 x_res[0] = x_2000*r-D;
		 
		 for(int i=1;i<10;i++) {
			 x_res[i]=x_res[i-1]*r-D;
		 }
		 
		 for(int i=0;i<10;i++) {
			 System.out.println(x_res[i]);
		 }
		 
	 }
}