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
		 int N=sc.nextInt();
		 int A=sc.nextInt();
		 int B = sc.nextInt();
		 int res;
		 if(N*A<B) {
			 res=N*A;
		 }else {
			 res=B;
		 }

		 System.out.println(res);
	 }
}