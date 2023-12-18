import java.util.Scanner;



 class Tuika{
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int nu=s.nextInt();
		int r=0;
		for(int i=num;i<=nu;i++) {
			String stri = String.valueOf(i);
		char a=stri.charAt(0);
		char b=stri.charAt(1);
		char c=stri.charAt(4);
		char d=stri.charAt(3);
		if(a==c &&b==d) {
			r++;
		}
	}
		System.out.print(r);
	}
}
