import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		String s=sc.next();
		int count=0;
		for(int i=1;i<s.length();i++) {
			if(s.substring(i-1, i).equals(s.substring(i, i+1))) {
				count++;
			}
		}
		System.out.println(n-count);

	}
}

