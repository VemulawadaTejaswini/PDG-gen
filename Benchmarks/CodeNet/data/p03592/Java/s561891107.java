import java.util.Scanner;
class Main{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		boolean bool=false;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=b;j++) {
				int bla=(a-i)*j+(b-j)*i;
				if(bla==c) {
					bool=true;
				}
			}
		}
		if(bool==true) {
			pl("Yes");
		}
		else {
			pl("No");
		}
	}
	public static void pl(String str) {
		System.out.println(str);
	}
}
