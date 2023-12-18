import java.util.Scanner;
class Main{
	static int yn=0;//YES,NO→0,Yes,No→1,yes,no→2
	static Scanner scan=new Scanner(System.in);
	public static void main(String[]args) {
		/*
		 Yes,No出力→plyn(Yes→1,No→0)
		 入力→sc();void
		 */
		int a=sc();
		int ans=1;
		int waru=1;
		for(int i=0;i<a;i++) {
			int b=sc();
			ans*=3;
			if(b%2==0) {
				waru*=2;
			}
		}
		System.out.println(ans-waru);
	}
	
	public static int sc() {
		int sc=scan.nextInt();
		return sc;
	}
	public static void plyn(int a) {
		if(yn==0) {
			if(a==1) {
		System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else if(yn==1){
			if(a==1) {
				System.out.println("Yes");
				}
			else {
				System.out.println("No");
			}
		}
		else if(yn==2){
			if(a==1) {
				System.out.println("yes");
				}
			else {
				System.out.println("no");
			}
		}
	}
}