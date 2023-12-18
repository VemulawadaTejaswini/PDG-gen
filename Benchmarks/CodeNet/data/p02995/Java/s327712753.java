
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

		 long last_d=0;
		 long last_cd=0;
		 long last_c,first_c,first_d,first_cd;
		 
		 if(B%C==0) {
			 last_c=B/C;
		 }else {
			 last_c=B/C+1;
		 }
		 if(A%C==0) {
			 first_c=A/C;
		 }else {
			 first_c=A/C;
		 }
		 
		 if(B%D==0) {
			 last_d=B/C;
		 }else {
			 last_d=B/C+1;
		 }
		 if(A%D==0) {
			 first_d=A/C;
		 }else {
			 first_d=A/C;
		 }

		 if(B%(C*D)==0) {
			 last_cd=B/(C*D);
		 }else {
			 last_cd=B/(C*D)+1;
		 }
		 if(A%(C*D)==0) {
			 first_cd=A/(C*D);
		 }else {
			 first_cd=A/(C*D);
		 }

		 

		 long c=last_c-first_c+1;
		 long d=last_d-first_d+1;
		 long cd=last_cd-first_cd+1;
		 long res=c+d-cd;





		 System.out.println(B-A+1-res);
	}



}