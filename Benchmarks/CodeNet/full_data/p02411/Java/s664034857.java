import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		int m, f, r;
		Scanner sc = new Scanner(System.in);

		while(true) {
		m = sc.nextInt();
		f = sc.nextInt();
		r = sc.nextInt();
		if(m==-1 && f==-1 && r==-1) break;

		if((m + f)>=80) {
			System.out.println('A');
		}else if((m + f)>=65 && (m+f)<=80) {
			System.out.println('B');
		}else if((m + f)>=50 && (m+f)<=65 ||r>=50) {
			System.out.println('C');
		}else if((m+f)<=30 && (m+f)>=50) {
			System.out.println('D');
		}else if((m+f)<=30) {
			System.out.println('F');
		}else if(r==-1 || f==-1) {
			System.out.println('F');
		}

	}

}
}
