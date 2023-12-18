import java.util.Scanner;
public class Main {

	public static int I(char a,char b) {
		if(a==b) {
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int ans=0;
		ans+=I(str.charAt(0),'C');
		ans+=I(str.charAt(1),'O');
		ans+=I(str.charAt(2),'D');
		ans+=I(str.charAt(3),'E');
		ans+=I(str.charAt(4),'F');
		ans+=I(str.charAt(5),'E');
		ans+=I(str.charAt(6),'S');
		ans+=I(str.charAt(7),'T');
		ans+=I(str.charAt(8),'I');
		ans+=I(str.charAt(9),'V');
		ans+=I(str.charAt(10),'A');
		ans+=I(str.charAt(11),'L');
		ans+=I(str.charAt(12),'2');
		ans+=I(str.charAt(13),'0');
		ans+=I(str.charAt(14),'1');
		ans+=I(str.charAt(15),'6');
		System.out.println(16-ans);
	}

}
