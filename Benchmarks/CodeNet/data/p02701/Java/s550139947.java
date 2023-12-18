import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 1;
		String[] s = new String[n];
		String[] j = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		j[0] = s[0];
		for(int i = 0; i < n; i++) {
			for(int m = 0; m < sum; m++) {
				if(s[i].equals(j[m])){
					break;
				}
				if(m==sum-1) {
					j[m+1]=s[i];
					sum++;
				}
			}
		}
	
		System.out.println(sum);
	}
	
}
