import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int ss = Integer.parseInt(s);
		int n = s.length();
		int []a = new int [n];
		int count = 0;
		int s3 = ss;
		
		for(int i = 0; i < n;i++) {
			a[n - 1 - i] = s3 % 10;
			s3 = s3 / 10;
		}
		for(int j = 1; j < n ; j++) {
			if(a[j] + a[j - 1] == 0) {
				a[j] = 1;
				count++;
			}
			if(a[j] + a[j - 1] == 2) {
				a[j] = 0;
				count++;
			}
		}
		System.out.println(count);
	
	}

}
