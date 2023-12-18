import java.util.Scanner;
class Main{
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	String b=scan.next();
	for(int i=0;i!=str.length();i++) {
		char ch=str.charAt(i);
		if(ch!='1') {
			System.out.println(ch);
			return;
		}
	}
	System.out.println(1);
	}
}