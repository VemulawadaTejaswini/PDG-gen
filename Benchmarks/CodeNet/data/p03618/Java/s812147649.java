import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String A=sc.nextLine();
		char b[]=A.toCharArray();
		int N=b.length;
		Arrays.sort(b);
		int i=0;char x='a';int c=0;
		long ans=1+N*(N-1)/2;
		while(i<N) {
			while(i<N&&x==b[i]) {
				c++;i++;
			}
			ans-=c*(c-1)/2;
			x++;
			c=0;
		}
		
		System.out.println(ans);
	}
}
