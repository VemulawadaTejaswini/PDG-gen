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
		 int count=0;
		 int res=1;

		 int n = sc.nextInt();
		 int x = sc.nextInt();
		 int[] L =new int[n];
		 for(int i=0;i<n;i++) {
			 L[i]=sc.nextInt();
			 count+=L[i];
			 if(count<=x) {
				 res++;
			 }
		 }
		 
		 System.out.println(res);



	 }
	 }