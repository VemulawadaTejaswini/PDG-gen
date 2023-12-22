import java.util.Scanner;
public class Main{
	public static void main(final String[] args){
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int c[] = new int[n];
		int a[] = new int[m];
		int s[] = new int[m];
		int sum = 0;
		int r = 0;

		
		for(int i = 0; i < n; i++){
			c[i] = sc.nextInt();
			for(int j = 0; j < m; j++){
				a[j] = sc.nextInt();
				s[j] += a[j];
			}
			if(s[i] < x) {
				sum += c[i];
			}
		}
		
		for(int value : s) {
			if(value < x) {
				r++;
			}
		}
		if(r == 0) {
			System.out.println(sum);
		}else {
			System.out.println(-1);
		}
		
	}
}
