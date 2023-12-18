import java.util.Scanner;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		Main main = new Main();
		String s= sc.next();
		for (int i=0;i<s.length();i++) {
			a[i]=main.char2Int(s.charAt(i));
		}
		for (int i=0;i<N;i++) {
			for (int j=1;j<N;j++) {
				a[j-1]=Math.abs(a[j]-a[j-1]);
			}
		}
		System.out.println(a[0]);
	}
	private int char2Int (char a) {
		return a-'0';
	}

}