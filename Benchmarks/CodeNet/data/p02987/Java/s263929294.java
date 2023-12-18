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
	 String S=sc.next();
	 char[] s=new char[4];
	 boolean judge1 =false;
	 boolean judge2 =false;
	 for(int i=0;i<4;i++) {
		s[i]=S.charAt(i);
	 }
	 for(int i=1;i<4;i++) {
		if(s[0]==s[i]) {
			judge1=true;
			s[i]='1';
			i=10;

		}
	 }
	 for(int i=1;i<3;i++) {
		if(s[i]==s[i+1]&&s[i]!=s[0]) {
			judge2=true;
		}
	 }
	 if(judge1==true&&judge2==true) {
		 System.out.println("Yes");
	 }else {
		 System.out.println("No");
	 }


	 }
}