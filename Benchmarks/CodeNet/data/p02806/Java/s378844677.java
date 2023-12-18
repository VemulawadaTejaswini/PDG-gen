import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];
		int t[] = new int[N];
		for (int i=0;i<N;i++) {
			s[i] = sc.next();
			t[i]= sc.nextInt();
		}
		String X = sc.next();
		int i;
		for (i=0;i<N;i++) {
			if(X.equals(s[i])) {
				break;
			}
		}
		int count =0;
		for (i=i+1;i<N;i++) {
			count+=t[i];
		}
	}
}