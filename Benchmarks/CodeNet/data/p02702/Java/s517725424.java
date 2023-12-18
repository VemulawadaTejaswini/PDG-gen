import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long count =0;
		for (int i=0;i<S.length()-4;i++) {
			int now = Integer.parseInt(S.substring(i, i+4));
			now = now %2019;
			if (now==0) {
				count ++;
			}
			for (int j=i+4;j<S.length();j++) {
				now = ((now*10)+S.charAt(j)-48)%2019;
				if (now==0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
