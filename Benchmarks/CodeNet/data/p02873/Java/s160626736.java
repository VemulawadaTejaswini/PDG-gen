
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c[] = sc.nextLine().toCharArray();
		sc.close();
		int n = c.length + 1;
		int sum = 0;
		int l=0,s=0;
		int start = 0;
		if(c[0]=='>') {
			for(int i=0; i<n-1 ;i++) {
				if(c[i]=='>') {
					start ++;
				}
			}
		}
		sum += calc(start);

		for(int i=start; i<n-1; ) {
			l=0;
			s=0;
			while(i<n-1 && c[i]=='<') {
				s++;
				i++;
			}
			while(i<n-1 && c[i]=='>') {
				l++;
				i++;
			}
			sum += calc(s,l);
		}
		System.out.println(sum);
	}

	public static int calc(int a, int b) {
		if(a <= b) {
			return b*(b+1)/2 + a*(a-1)/2;
		}else {
			return a*(a+1)/2 + b*(b-1)/2;
		}
	}
	public static int calc(int a) {
		return a*(a+1)/2;
	}

}