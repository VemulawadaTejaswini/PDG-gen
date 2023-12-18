import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		
		long sum = 1;
		int[] ab = new int[26];
		int len = A.length();
		ab[A.charAt(0)-'a'] ++;
		for(int i=1; i<len; i++) {
			sum += i-ab[A.charAt(i)-'a'];
			ab[A.charAt(i)-'a'] ++;
		}
		System.out.println(sum);
	}

}
