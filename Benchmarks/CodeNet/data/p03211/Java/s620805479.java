import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int l=S.length();
		int a[]=new int[l-2];
		int min = 10000;
		for (int i = 0; i < l-2; i++) {
			String b=S.substring(i,i+1)+S.substring(i+1,i+2)+S.substring(i+2,i+3);
			a[i]=Integer.parseInt(b);
			int c = Math.abs(a[i]-753);
			if(c<=min) {
				min=c;
			}
		}
		System.out.println(min);
	}
}