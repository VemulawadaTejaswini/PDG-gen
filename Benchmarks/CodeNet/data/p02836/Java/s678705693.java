import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] a = s.toCharArray();
		int count = 0;
			for(int i = 0;i < s.length()/2;i++) {
				if(a[i] == a[s.length()-i-1]) {

				}else {
					count++;
				}
			}

			System.out.println(count);
	}

}
