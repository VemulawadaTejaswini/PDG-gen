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
		 int P=sc.nextInt();
		 int Q=sc.nextInt();
		 int R= sc.nextInt();
		 
		 int res=P+Q;
		 if(res>Q+R) {
			 res=Q+R;
		 }
		 if(res>P+R) {
			 res=P+R;
		 }
		 System.out.println(res);




	 }



	 }