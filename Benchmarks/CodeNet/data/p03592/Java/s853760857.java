import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		if(n>m) {
			int temp=n;
			n=m;
			m=temp;
		}
		
		for(int i=0;i<k/n;i++) {
			if((k-n*i)%(n-2*i)==0) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}