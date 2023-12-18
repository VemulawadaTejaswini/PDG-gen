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
		 int M = sc.nextInt();
		 int[] a = new int[N];
		 int p=0;
		 int res=0;
		 for(int i = 0;i<M;i++) {
			 int k;
			 k=sc.nextInt();
			 for(int j = 0;j<k;j++) {
				 int s=sc.nextInt();
				 s--;
				 a[s]|=1<<i;
			 }
		 }
		 for(int i =0;i<M;i++) {
			 int x=sc.nextInt();
			 p |= x<<i;
		 }
		 
		 for(int j = 0;j<Math.pow(2, N);j++) {
			 int t = 0;
			 for(int i = 0;i<N;i++) {
				 if((j>>i&1)==1) {
					 t ^= a[i];
				 }
			 }
			 if(t==p) {
				 res++;
			 }
		 }
		 System.out.println(res);
	 }
}