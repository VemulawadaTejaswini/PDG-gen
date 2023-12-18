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
		 int N=sc.nextInt();
		 int[] w=new int[N];
		 int S1,S2;
		 int res=10000000;
		 for(int i=0;i<N;i++) {
			 w[i]=sc.nextInt();
		 }
		 for(int i=0;i<N;i++) {
			 S1=0;
			 S2=0;
			 for(int j=0;j<=i;j++) {
				 S1+=w[j];
			 }
			 for(int k=i+1;k<N;k++) {
				 S2+=w[k];
			 }
			 if(res>Math.abs(S1-S2)) {
				 res=Math.abs(S1-S2);
			 }
		 }


		 System.out.println(res);
	 }



	 }