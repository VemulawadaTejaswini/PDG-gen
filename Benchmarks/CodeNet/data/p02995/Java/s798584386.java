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
		 long A = sc.nextLong();
		 long B = sc.nextLong();
		 long C = sc.nextLong();
		 long D = sc.nextLong();


		 long last_c=0;
		 long last_d=0;
		 long last_cd=0;
		 for(long i=B;i>0;i--) {
			if(i%C==0) {
				last_c=i/C;
				break;
			}
		 }
		 for(long i=B;i>0;i--) {
			if(i%D==0) {
				last_d=i/D;
				break;
			}
		 }
		 for(long i=B;i>=A;i--) {
			if(i%(C*D)==0) {
				last_cd=i/(C*D);
				break;
			}
		 }

		 long first_c=0;
		 long first_d=0;
		 long first_cd=0;

		 for(long i=A;i<=B;i++) {
			if(i%(C*D)==0) {
				first_cd=i/(C*D);
				break;
			}
		 }
		 for(long i=A;i<=B;i++) {
			if(i%C==0) {
				first_c=i/C;
				break;
			}
		 }
		 for(long i=A;i<=B;i++) {
			if(i%D==0) {
				first_d=i/D;
				break;
			}
		 }

		 long c=last_c-first_c+1;
		 long d=last_d-first_d+1;
		 long cd=last_cd-first_cd+1;
		 long res=c+d-cd;





		 System.out.println(B-A+1-res);
	}



}