import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Main main=new Main();
		main.solve();
	}

	private void solve() {

		Scanner sc=new Scanner (System.in);

		int length=sc.nextInt();
		int question=sc.nextInt();
		String s=sc.next();
		StringBuffer sb=new StringBuffer();
		for (int index=0; index<question; index++) {
			try {
			sb.append(s.substring(sc.nextInt()-1, sc.nextInt()));
			} catch (Exception e) {

			}

			int count=0;
			for (int index2=0; index2<sb.length()-1; index2++) {
				if (sb.charAt(index2)=='A'&&sb.charAt(index2+1)=='C') {
					count++;
				}
			}
			System.out.println(count);
			sb.delete(0,sb.length());
		}
	}
}