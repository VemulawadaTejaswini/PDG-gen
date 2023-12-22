import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s1 = sc.next().toCharArray();
		int n = s1.length;
		char[] s2 = new char[n];
		for(int i=0;i<n;i++) {
			s2[i] = s1[n-1-i];
		}
		System.out.println(String.valueOf(s2));
	}

}