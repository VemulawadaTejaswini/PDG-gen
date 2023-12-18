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
	 int j1=0;
	 int j2=0;
	 for(int i=0;i<4;i++) {
		s[i]=S.charAt(i);
	 }

	 
	 for(int i=0;i<4;i++) {
		if(s[i]==s[i+1]&&s[i]!='a'&&judge1==false) {
			judge1=true;
			s[i+1]='a';
		}else if(s[i]==s[i+1]&&s[i]!='a'&&judge1==true) {
			judge2=true;
			i=5;
		}
	 }
	 
	 
	 
	 if(judge1==true&&judge2==true) {
		 System.out.println("Yes");
	 }else {
		 System.out.println("No");
	 }


	 }
}