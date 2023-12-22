import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		
		double ans = 0;
		for(int i=0;i<k;i++) {
			ans+=Math.log(a[i]);
		}
		double prev = ans;
		for(int i=k;i<n;i++) {
			ans-=Math.log(a[i-k]);
			ans+=Math.log(a[i]);
			if(ans>prev) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			prev = ans;
		}
		
	}

}