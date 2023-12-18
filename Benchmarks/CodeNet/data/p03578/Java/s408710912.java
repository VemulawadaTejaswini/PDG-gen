import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main{
	static int yn=0;//YES,NO→0,Yes,No→1,yes,no→2
	static Scanner scan=new Scanner(System.in);
	public static void main(String[]args) {
		/*通常出力→pl(String),
		 Yes,No出力→plyn(Yes→1,No→0)
		 入力→sc();void
		 */
		int a=sc();
		List <Integer> List =new ArrayList<Integer>();
		for(int i=0;i<a;i++) {
			int b=sc();
			List.add(b);
		}
		int c=sc();
		for(int i=0;i<c;i++) {
			int d=sc();
			int e=List.indexOf(d);
			if(e==-1) {
				plyn(0);
				return;
			}
			else {
				List.remove(e);
			}
		}
		plyn(1);
	}
	
	public static int sc() {
		int sc=scan.nextInt();
		return sc;
	}
	public static void pl(String str) {
		System.out.println(str);
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