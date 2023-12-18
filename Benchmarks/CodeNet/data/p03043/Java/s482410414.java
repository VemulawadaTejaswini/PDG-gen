import java.util.Scanner;


class Solve{

	
	 public void solve() {
		 Scanner sc = new Scanner(System.in) ;
		 double N = sc.nextInt();
		 double K = sc.nextInt();
		 double n=0d;
		 double res=0d;
		 
		 
		
		 
		 
		 for(double i = 0;i<N;i++) {
			 if(Math.pow(2, i)>K) {
				 n=i;
				 i=N;
			 }
		 }
		 
		 for(double j = n;j>=1;j--) {
			 res+=1/(N*Math.pow(2, j));
		 }
		 if(N<K) {
			 System.out.println(res);
		 }else {
			 System.out.println(1-res);
		 }
		 
		 
		 
		

		 }
	

	 
}





public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();

	}
}