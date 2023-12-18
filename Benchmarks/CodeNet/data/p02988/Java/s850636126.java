import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Solve s= new Solve();
		s.solve();
	}

}
class Solve{
	 Scanner sc = new Scanner(System.in) ;

	 void solve() {
	 int n=sc.nextInt();
	 int res=0;
	 int[] p= new int[n];
	 
	 for(int i=0;i<n;i++) {
		 p[i]=sc.nextInt();
	 }
	 for(int i=0;i<n-2;i++) {
		 if(p[i+1]<p[i]) {
			 if(p[i+1]>=p[i+2]) {
				 res++;
			 }
		 }
		 if(p[i+1]>=p[i]) {
			 if(p[i+1]<p[i+2]) {
				 res++;
			 }
		 }
	 }
	 System.out.println(res);


	 }
}